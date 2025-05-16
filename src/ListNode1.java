    public class ListNode1 {
        int val;
        ListNode1 next;
        ListNode1() {}
        ListNode1(int val) { this.val = val; }
        ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
    }

    class MergeTwoSortedList {
        /* В данной задаче требуется взять два отсортированных связанных списка и объединить их в один.
           * Новый список должен состоять из связанных узлов исходных списокв.
           * Новый список надо отсортировать по возрастанию.
         */
        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(0); // Фиктивный узел
            ListNode current = dummy;

            // Пока один из списокв содержит элементы
            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    current.next = list1; // Добавляем меньший элемент
                    list1 = list1.next;     // Двигаемся дальше по list1 с помощью current
                    current = current.next;
                } else {
                    current.next = list2; // Добавляем меньший элемент
                    list2 = list2.next;     // Двигаемся дальше по list2 с помощью current
                    current = current.next;
                }
            }
            // Если есть остатки то добавляем их.
            current.next = list1 == null ? list2 : list1;
            return dummy.next;

        }
        public static void main(String[] args) {
            ListNode list1 = new ListNode(1, new  ListNode(2, new  ListNode(3, new  ListNode(4))));
            ListNode list2 = new ListNode(1, new  ListNode(2, new  ListNode(3, new  ListNode(4))));
            print(mergeTwoLists(list1,list2));

            print(mergeTwoLists(null, new ListNode(0)));
        }
        static void print(ListNode node) {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }
            System.out.println();
        }
    }
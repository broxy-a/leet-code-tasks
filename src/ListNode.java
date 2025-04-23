    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class MergeTwoSortedList {
        /* В данной задаче требуется взять два отсортированных связанных списка и объединить их в один.
           * Новый список должен состоять из связанных узлов исходных списокв.
           * Новый список надо отсортировать по возрастанию.
         */
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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

        }
    }
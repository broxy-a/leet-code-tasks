import java.util.*;

  class ListNode {
     int val;
     ListNode next;
     ListNode() {}

      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


public class RemoveDuplicatesFromSortedList {
      /* Здесь потребуется написать решение для задачи, где датеся отсортированный связанный список, и из него нужно удалить дубликаты.
      * [3,3,4,4,5,5,5] -> из этого
      * [3,4,5] -> в это
       */
    public ListNode removeDuplicates(ListNode head) {
        if (head == null) return null; // Проверка на пустой список
        if (head.next == null) return head; // Проверка если в списке 1 элемент

        ListNode current = head; // Указатель который двигается по списку.

        while (current.next != null) { // Пока есть следующий элемент

            if (current.val == current.next.val) { // Если значение текущего элемента равно значению следующего элемента.

                current.next = current.next.next; // Пропускаем следующий элемент и удаляем дубликат

            } else if (current.val != current.next.val) { // Если они не равны
                current = current.next; // То двигаемся далее
            }
        }
        return head; // Возвращаем список

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);


        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        ListNode result = solution.removeDuplicates(head);


        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
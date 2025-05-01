public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        /* Эта задача похожа на RemoveDuplicates: нужно перезаписать массив, исключив определённое значение val.
         * Указатель current указывает на позицию, куда мы будем записывать подходящие элементы.
         * Цикл проходит по всем элементам массива.
         * Если текущий элемент не равен val, мы сохраняем его на позицию current и сдвигаем current вперёд.
         */

        int current = 0;

          if (nums.length == 0) {
              return 0;
          }

          for (int i = 0; i < nums.length; i++) {
              if (nums[i] != val) {
                    nums[current] = nums[i];
                    current++;
              }
          }

        return current;
    }
    public static void main(String[] args) {
        System.out.println(new RemoveElement().removeElement(new int[]{3,2,2,3}, 3));

    }
}

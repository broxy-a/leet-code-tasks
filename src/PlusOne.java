import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        /* Дано целое число в виде массива. Каждый элемент в нем это одна цифра, расположенная от старшей к младшей
        * [1,2,4] - 1 - сотни, 2 - десятки, 4 - единицы
        * [1,2,3] - это число 123. Прибавляем 1 -> получаем 124 -> возвращаем [1,2,4]
         */
         for (int i = digits.length - 1; i >= 0; i--) { // Начинаем с конца массива, т.е с единиц

            if (digits[i] < 9) { // Если элемент массива меньше 9
                digits[i]++;
                return digits; // Прибавляем 1, и заканчиваем.
            } else if (digits[i] == 9) { // Если элемент массива равен 9
                 digits[i] = 0; // Превращаем его в 0
             }

         }
        int[] newDigits = new int[digits.length + 1]; // Тут же создаем новый массив, который по длинне больше чем исходны на 1 элемент.
         newDigits[0] = 1; // Первый элемент всегда будет равен 1
         return newDigits; // Возвращаем новый массив, это для случая с 9 или есл все элементы будут состоять из 9.
    }

    public static void main(String[] args) {
        PlusOne test = new PlusOne();
        int[] result1 =  test.plusOne(new int[] {1, 2, 3});
        System.out.println(Arrays.toString(result1));

        int[] result2 =  test.plusOne(new int[] {4, 3, 2, 1});
        System.out.println(Arrays.toString(result2));

        int[] result3 = test.plusOne(new int[] {9, 9, 9});
        System.out.println(Arrays.toString(result3));
    }
}

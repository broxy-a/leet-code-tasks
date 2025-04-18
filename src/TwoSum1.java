import java.util.Arrays;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
<<<<<<< HEAD

        // Первый цикл проходит по массиву чисел.
        for (int i = 0; i < nums.length; i++) { 
            for (int j = i + 1; j < nums.length; j++) { // Вложенный цикл, проходится по массиву, но при этом ищет второе число для target.


=======
        /* В этой задаче задан массив чисел и искомое число. Нужно найти числа по индексу, которые в сумме дают искомое число*/

        // Первый цикл проходит по массиву чисел.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Вложенный цикл, проходится по массиву, но при этом ищет второе число для target.
                
>>>>>>> 9ce91d49f8939cbe76702193c16046c57183edaf
                if (nums[i] + nums[j] == target) { // Если числа i и j в сумме дают target, значит вернем их индексы в виде массива.
                   int[] result = {i, j};
                   return result;
                }   
            }
        }
            return null;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum1().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

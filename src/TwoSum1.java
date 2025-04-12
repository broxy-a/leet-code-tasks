import java.util.Arrays;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   int[] result = {i, j};
                   return result;
                }   
            }
        }
            return null;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = {2, 7, 11, 15};
        int target = 10;
        int[] result = new TwoSum1().twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

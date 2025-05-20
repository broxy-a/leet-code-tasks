import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /* Здесь мы будем сливать два отсортированных массива в один, используя два указателя
        * Указатели будут идти с конца массивов
         */

        // i - индекс последнего значимого элемента в nums1
        // j - индекс последнего элемента в nums2
        // k - индекс последней позиции в результирующем массиве nums1
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        // Пока в массивах есть элементы
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j] ) {
                // Если текущий элемент в nums2 больше то ставим его вместо элемента k.
                nums1[k] = nums2[j];
                k--; j--;

            } else {
                // Иначе помещает элемент из nums1 (равенство тоже учитывается)
                nums1[k] = nums1[i];
                k--; i--;
            }
        }

        // Если массив nums2 закончился раньше, то тогда копируем остатки в nums1
        if (j >= 0) {
            System.arraycopy(nums2, j, nums1, i + 1, j + 1);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println("Test 1: " + Arrays.toString(nums1));

        int[] nums3= {1};
        int[] nums4 = {};
        int s = 1, p = 0;
        merge(nums1, m, nums2, n);
        System.out.println("Test 2: " + Arrays.toString(nums3));



    }
}

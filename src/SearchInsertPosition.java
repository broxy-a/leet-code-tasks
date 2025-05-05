public class SearchInsertPosition {
    public int  searchInsert(int[] nums, int target) {
        /* В этой задаче требуется воспользоваться бинарнным поиском для target
        * Массив отсортирован
        * Вернуть индекс target если он найден, иначе - позицию для вставки.
         */

        int low = 0;
        int high = nums.length - 1;

        // Бинарный поиск
        while (low <= high) {
            int mid = low + (high - low) / 2; // Обозначение середины

            if (target == nums[mid]) { // Сразу найдено значение
                return mid;
            }
             if (target < nums[mid]) { // Если target меньше середины, то идем в лево
                 high = mid - 1;
             } else if (target > nums[mid]) { // Если наоборот, то в право
                 low = mid + 1;
             }

        }
        return low; // Если не найден элемент, то вернуть low как первый индекс.
    }
    public static void main(String[] args) {
        SearchInsertPosition sap = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 6;
        System.out.println(sap.searchInsert(nums, target));

        int[] nums1 = {1,3,5,7};
        int target1 = 8;
        System.out.println(sap.searchInsert(nums1, target1));
    }
}

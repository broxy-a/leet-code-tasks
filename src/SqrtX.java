public class SqrtX {
    public int MySqrt(int x) {
        /* Функция которая угадывает корень числа (именно что угадывает), т.к тут используется бинарный поиск
         */
        int left = 0; // Указатель для левой стороны
        int right = x; // Указатель для правой стороны

        while (left <= right) { // Бинарный поиск
            int mid = (right + left) / 2; // Середина
            long s = (long) mid * mid; // Квадрат числа

            if (s == x) { // Если корень равен x
                return mid;
            } else if (s < x) { // Если корень меньше х
                left = mid + 1; // Ищем в правой части
            } else {
                right = mid - 1; // Иначе в левой
            }
        }
        return right; // Вернуть наибольшее число, чей квадрат меньше или равен х
    }
    public static void main(String[] args) {
        System.out.println(new SqrtX().MySqrt(26));
        System.out.println(new SqrtX().MySqrt(191));
        System.out.println(new SqrtX().MySqrt(1));
    }
}

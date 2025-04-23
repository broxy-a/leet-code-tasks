public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        /* В этой задаче требуется написать код, который проверяет число на палиндром 
            (это число, которое читается одинаково слева направо и спарва налево) */

        int reversed = 0;                            
        if (x == 0) {                           // Если число равно 0, то оно палиндром. Отрицательные числа и числа, оканчивающиеся на 0 (кроме 0), не палиндромы. 
            return true;                        
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }
        while (x > reversed) {          // Переворачиваем половину числа. Цикл продолжается, пока оригинальное число больше перевёрнутой половины.
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return x == reversed || x == reversed / 10;
    }
       
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12321));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(0));

    }
}

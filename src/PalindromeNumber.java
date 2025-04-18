public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        /* В этой задаче требуется написать код, который проверяет число на палиндром 
            (это число, которое читается одинаково слева направо и спарва налево) */

<<<<<<< HEAD
        int reversed = 0;                            
        if (x == 0) {                           // Если число равно 0, то оно палиндром. Отрицательные числа и числа, оканчивающиеся на 0 (кроме 0), не палиндромы. 
            return true;                        
=======
        int reversed = 0;
        if (x == 0) {                            // Если число равно 0, то оно палиндром. Отрицательные числа и числа, оканчивающиеся на 0 (кроме 0), не палиндромы. 
            return false;
>>>>>>> 9ce91d49f8939cbe76702193c16046c57183edaf
        } else if (x < 0 || x % 10 == 0) {
            return false;
        }
<<<<<<< HEAD
        while (x > reversed) {                  // Переворачиваем половину числа. Цикл продолжается, пока оригинальное число больше перевёрнутой половины.
=======
        while (x > reversed) {                   // Переворачиваем половину числа. Цикл продолжается, пока оригинальное число больше перевёрнутой половины.
>>>>>>> 9ce91d49f8939cbe76702193c16046c57183edaf
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

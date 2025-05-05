import java.util.*;

 class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        /* В этой задаче надо найти длинну последнего слова в стровке
         * s = "Artorias Abysswalker" length = 11;
         */
        // Массив разбивает строку по проблеам на массив подстрок
        String[] l = s.split(" ");
        return l[l.length - 1].length(); // Возвращается последний элемент массива
    }
    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("Hello World"));
    }
}

public class FindTheIndex {
    public int strStr(String haystack, String needle) {
        /* В этой задаче требуется выяснить, содержится ли подстрока sad в строке haystack.
        * Если да, то вернуть индекс с которого начинается подстрока
        * Если нет, вернуть -1
        * Если строка needle изначальное пустая вернуть 0  */


        if (needle.length() == 0) {
            return 0;
        }
            for (int i = 0; i <= haystack.length() - needle.length(); i++) { // Цикл проходит длинну слов от haystack до needle что бы знать границы.

                if (haystack.substring(i, i + needle.length()).equals(needle)) { // Если подстрока haystack с позиции i совпадает с needle, вернуть i как индекс вхождения.

                    return i;
                }
            }
            return -1;
    }
    public static void main(String[] args) {
        System.out.println(new FindTheIndex().strStr("leetcode", "leeto"));
        System.out.println(new FindTheIndex().strStr("sadbutsad", "sad"));
    }
}

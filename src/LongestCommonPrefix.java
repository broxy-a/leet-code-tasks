public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /* В этой задаче нужно найти самый длинный общий префикс в массиве строк
        * Вход: ["flower", "flow", "flight"]
        * Выход: "fl"
         */

        if (strs.length == 0) return ""; // Если массив пуст вернуть ""
        if (strs.length == 1) return strs[0]; // Если массив состоит из 1 элемента, вернуть его

        String s = strs[0]; // Строка которая служит примером для сравнения

        for (int i = 0; i < s.length(); i++) { // Проходит по символам строки первого элемента массива
            for (int j = 1; j < strs.length; j++) { // Проходит по массиву начиная со второго элемента

                if (strs[j].length() <= i) { // Достаточно ли длина текущей строки (strs[j]) для текущего индекса i.
                    return s.substring(0, i);
                }

                if (s.charAt(i) != strs[j].charAt(i)) { // Если символ строки s не равен символу строки j
                    return s.substring(0, i); // Вернуть общий префикс
                }
            }
        }
        return s;
    }
    public static void main(String[] args) {
    }
}

import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        /* В этой задаче требуется проверить валидность скобок. Валидность заключается в следующем:
         * s = "()"
         * s = "()[]{}"
         * s = "(]"
        */

        // Стек - LIFO (Last In First Out)
        Stack<Character> stack = new Stack<>();
        
        // Цикл который проходит по строке s.
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') { // Если символ открывающяя скобка, то добавляем в стек.
                stack.push(c);

            } else if (c == ')' || c == '}' || c == ']') { // Иначе если, скобка закрывающяя то сразу проверяем стек на пустоту.
                if (stack.empty()) { 
                    return false;
                }

                char last = stack.pop();            // Если last (открывающяя скобка) не соответсвтует закрывающей скобке c, то false.
                if (!((last == '(' && c == ')') ||
                    (last == '{' && c == '}') ||
                    (last == '[' && c == ']'))) {
                        return false;
                }
            }
        }
        // Вернуть пустой стек.
        return stack.empty();
    }
    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();
        System.out.println(validator.isValid("()"));     
        System.out.println(validator.isValid("()[]{}")); 
        System.out.println(validator.isValid("(]"));     
        System.out.println(validator.isValid("([)]"));  
        System.out.println(validator.isValid("{[]}"));   
    }
}

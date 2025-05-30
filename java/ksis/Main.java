import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(isValidBrackets("({[]})"));
        System.out.println(isValidBrackets("({]})"));
    }


        private static boolean isValidBrackets(String bracketString) {
      Map<Character, Character>  brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');


        Deque<Character> stack = new LinkedList<>();
        for (Character c: bracketString.toCharArray()) {
            if (brackets.containsValue(c)) { // открывающая скобка
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
 }

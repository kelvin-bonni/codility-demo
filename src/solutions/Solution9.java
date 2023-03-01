package solutions;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;
import java.util.regex.Pattern;

public class Solution9 {

    public static void main(String[] args) {
        Solution9 solution1 = new Solution9();
//        System.out.println(Solution9.solutions("()[]{}"));
        System.out.println(Solution9.solutions("(]"));
    }

    public static String solutions(String input){
        String result = "valid";
        char[] ch = input.toCharArray();
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
                //Add new opening parenthesis
                stringStack.add(String.valueOf(ch[i]));
            } else {
                //if it's not an opening parenthesis meaning its a closing one
                //then you pop the last element and check if its opening version
                //if it's not return invalid or imbalance
                String lastElement = stringStack.pop();
                if (Objects.equals(lastElement, "(") && ch[i] != ')')
                    return "invalid";
                if (Objects.equals(lastElement, "{") && ch[i] != '}')
                    return "invalid";
                if (Objects.equals(lastElement, "[") && ch[i] != ']')
                    return "invalid";
            }
        }
        return result;
    }
}

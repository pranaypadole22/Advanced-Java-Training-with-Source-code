package AdV_JAVA_DAY5;
import java.util.Stack;

// WAP to check if parentheses in the given expression are correct or not.
public class StckCFDemo1 {

    public static boolean isValid(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String input1 = "{[()]}";
        System.out.println("Input: " + input1 + " → Is valid? " + isValid(input1));

        String input2 = "({[})";
        System.out.println("Input: " + input2 + " → Is valid? " + isValid(input2));
    }
}

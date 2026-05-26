import java.util.Stack;

public class ReverseStringStack {

    public static String reverse(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        String result = "";

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "hello";

        System.out.println(reverse(s));
    }
}
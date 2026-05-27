import java.util.Stack;

public class RemoveDuplicates {

    public static String remove(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        String result = "";

        for (char ch : stack) {
            result += ch;
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "abbaca";

        System.out.println(remove(s));
    }
}
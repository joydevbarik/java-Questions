import java.util.Stack;

public class ReverseWords {

    public static String reverse(String s) {

        String[] words = s.split(" ");

        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }

        String result = "";

        while (!stack.isEmpty()) {
            result += stack.pop() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        String s = "I Love Java";

        System.out.println(reverse(s));
    }
}
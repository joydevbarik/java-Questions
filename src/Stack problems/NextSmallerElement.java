import java.util.Stack;

public class NextSmallerElement {

    public static void nextSmaller(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                System.out.println(arr[i] + " -> -1");
            } else {
                System.out.println(arr[i] + " -> " + stack.peek());
            }

            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 2};

        nextSmaller(arr);
    }
}
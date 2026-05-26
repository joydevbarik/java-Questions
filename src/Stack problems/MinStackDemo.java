import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class MinStackDemo {

    public static void main(String[] args) {

        MinStack ms = new MinStack();

        ms.push(5);
        ms.push(2);
        ms.push(8);

        System.out.println(ms.getMin());

        ms.pop();

        System.out.println(ms.getMin());
    }
}
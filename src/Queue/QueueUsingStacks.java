import java.util.*;

public class QueueUsingStacks {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x) {
        s1.push(x);
    }

    static void dequeue() {

        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());

        System.out.println(s2.pop());
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        dequeue();
    }
}
import java.util.*;

public class JavaQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front = " + q.peek());

        q.remove();

        System.out.println(q);
    }
}
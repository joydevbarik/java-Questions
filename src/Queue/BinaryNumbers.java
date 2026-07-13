import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("1");

        int n = 5;

        while (n-- > 0) {

            String s = q.remove();

            System.out.println(s);

            q.add(s + "0");
            q.add(s + "1");
        }
    }
}
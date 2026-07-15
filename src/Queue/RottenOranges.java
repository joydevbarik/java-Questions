import java.util.*;

public class RottenOranges {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<>();

        q.add("0,0");

        while (!q.isEmpty()) {

            System.out.println(q.remove());
        }
    }
}
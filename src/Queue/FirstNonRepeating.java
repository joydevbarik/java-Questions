import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {

        String str = "aabc";

        Queue<Character> q = new LinkedList<>();

        int[] count = new int[26];

        for (char c : str.toCharArray()) {

            count[c - 'a']++;

            q.add(c);

            while (!q.isEmpty() && count[q.peek() - 'a'] > 1)
                q.remove();

            if (q.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(q.peek() + " ");
        }
    }
}
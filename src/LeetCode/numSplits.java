import java.util.*;

public class numSplits {

    public static int numSplits(String s) {

        int n = s.length();
        int count = 0;

        for (int i = 1; i < n; i++) {

            HashSet<Character> left = new HashSet<>();
            HashSet<Character> right = new HashSet<>();

            for (int j = 0; j < i; j++)
                left.add(s.charAt(j));

            for (int j = i; j < n; j++)
                right.add(s.charAt(j));

            if (left.size() == right.size())
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(numSplits(s));

        sc.close();
    }
}
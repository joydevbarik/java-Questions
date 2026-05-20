import java.util.*;

public class CountVowels {

    public static int countVowels(String str) {

        int count = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(countVowels(str));

        sc.close();
    }
}
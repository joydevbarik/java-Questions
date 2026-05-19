import java.util.*;

public class CharacterOccurrence {

    public static int occurrence(String str, char target) {

        int count = 0;

        for (char c : str.toCharArray()) {

            if (c == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char target = sc.next().charAt(0);

        System.out.println(occurrence(str, target));

        sc.close();
    }
}
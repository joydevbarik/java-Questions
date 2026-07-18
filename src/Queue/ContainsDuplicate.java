import java.util.HashSet;

public class ContainsDuplicate {

    static boolean check(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(x))
                return true;

            set.add(x);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};

        System.out.println(check(arr));
    }
}
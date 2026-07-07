public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 12321;

        String s = String.valueOf(num);

        int left = 0, right = s.length() - 1;

        boolean ok = true;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                ok = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(ok);
    }
}
public class MaxVowels {

    public static int maxVowels(String s, int k) {
        int maxCount = 0;

        for (int i = 0; i <= s.length() - k; i++) {
            int count = 0;

            for (int j = i; j < i + k; j++) {
                char ch = s.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));
    }
}
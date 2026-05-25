import java.util.*;

interface Master {
    int guess(String word);
}

public class Solution {

    public void findSecretWord(String[] words, Master master) {

        List<String> list = new ArrayList<>(Arrays.asList(words));

        while (!list.isEmpty()) {

            String guessWord = list.get(0);

            int matchCount = master.guess(guessWord);

            if (matchCount == 6) {
                System.out.println("Secret Word Found: " + guessWord);
                return;
            }

            List<String> newList = new ArrayList<>();

            for (String word : list) {
                if (match(word, guessWord) == matchCount) {
                    newList.add(word);
                }
            }

            list = newList;
        }
    }

    int match(String a, String b) {

        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String[] words = {
            "planet", "people", "animal", "school"
        };

        Master master = new Master() {

            String secret = "planet";

            public int guess(String word) {

                int count = 0;

                for (int i = 0; i < 6; i++) {

                    if (word.charAt(i) == secret.charAt(i)) {
                        count++;
                    }
                }

                return count;
            }
        };

        Solution sol = new Solution();

        sol.findSecretWord(words, master);
    }
}
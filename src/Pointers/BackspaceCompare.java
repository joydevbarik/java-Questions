public class BackspaceCompare {

    static String build(String s) {

        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c != '#')
                sb.append(c);
            else if (sb.length() > 0)
                sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(build("ab#c").equals(build("ad#c")));
    }
}
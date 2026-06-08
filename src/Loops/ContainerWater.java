public class ContainerWater {

    public static void main(String[] args) {

        int[] h = {1,8,6,2,5,4,8,3,7};

        int max = 0;

        for (int i = 0; i < h.length; i++) {

            for (int j = i + 1; j < h.length; j++) {

                int area = Math.min(h[i], h[j]) * (j - i);

                max = Math.max(max, area);
            }
        }

        System.out.println(max);
    }
}
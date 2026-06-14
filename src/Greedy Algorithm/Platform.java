import java.util.*;

public class Platform {

    public static void main(String[] args) {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1, j = 0;
        int platforms = 1, result = 1;

        while (i < arr.length && j < dep.length) {

            if (arr[i] <= dep[j]) {
                platforms++;
                i++;
            } else {
                platforms--;
                j++;
            }

            result = Math.max(result, platforms);
        }

        System.out.println("Platforms Required = " + result);
    }
}
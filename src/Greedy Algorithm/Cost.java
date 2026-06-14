import java.util.*;

public class Cost {

    public static void main(String[] args) {

        int ropes[] = {4, 3, 2, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int rope : ropes)
            pq.add(rope);

        int cost = 0;

        while (pq.size() > 1) {

            int first = pq.poll();
            int second = pq.poll();

            int sum = first + second;

            cost += sum;

            pq.add(sum);
        }

        System.out.println("Minimum Cost = " + cost);
    }
}
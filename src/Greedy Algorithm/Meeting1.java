import java.util.*;

public class Meeting1 {

    static class Meeting {
        int start, end;

        Meeting(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {

        Meeting meetings[] = {
                new Meeting(1, 2),
                new Meeting(3, 4),
                new Meeting(0, 6),
                new Meeting(5, 7)
        };

        Arrays.sort(meetings,
                (a, b) -> a.end - b.end);

        int count = 1;
        int lastEnd = meetings[0].end;

        for (int i = 1; i < meetings.length; i++) {

            if (meetings[i].start > lastEnd) {
                count++;
                lastEnd = meetings[i].end;
            }
        }

        System.out.println(count);
    }
}
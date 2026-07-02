public class CountNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int count(Node head) {

        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }

        return count;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println(count(head));
    }
}
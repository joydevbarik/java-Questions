public class SumNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static int sum(Node head) {

        int sum = 0;

        while (head != null) {
            sum += head.data;
            head = head.next;
        }

        return sum;
    }

    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);

        System.out.println(sum(head));
    }
}
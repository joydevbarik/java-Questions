public class InsertAtEnd {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node head, int value) {

        Node newNode = new Node(value);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;

        return head;
    }

    static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);

        head = insert(head, 3);

        print(head);
    }
}
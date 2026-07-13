public class QueueLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node front, rear;

    static void enqueue(int x) {

        Node node = new Node(x);

        if (rear == null) {
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    static void dequeue() {

        if (front == null)
            return;

        System.out.println(front.data);

        front = front.next;

        if (front == null)
            rear = null;
    }

    public static void main(String[] args) {

        enqueue(5);
        enqueue(10);
        enqueue(15);

        dequeue();
    }
}
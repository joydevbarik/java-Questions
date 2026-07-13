public class QueueArray {

    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    static void enqueue(int x) {

        if (rear == queue.length - 1) {
            System.out.println("Queue Full");
            return;
        }

        if (front == -1)
            front = 0;

        queue[++rear] = x;
    }

    static void dequeue() {

        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Removed: " + queue[front++]);
    }

    static void display() {

        for (int i = front; i <= rear; i++)
            System.out.print(queue[i] + " ");
    }

    public static void main(String[] args) {

        enqueue(10);
        enqueue(20);
        enqueue(30);

        dequeue();

        display();
    }
}
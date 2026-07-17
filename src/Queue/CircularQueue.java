public class CircularQueue {

    static int[] q = new int[5];
    static int front = -1, rear = -1;

    static void enqueue(int x) {

        if ((rear + 1) % 5 == front) {
            System.out.println("Full");
            return;
        }

        if (front == -1)
            front = 0;

        rear = (rear + 1) % 5;
        q[rear] = x;
    }

    static void display() {

        int i = front;

        while (true) {

            System.out.print(q[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % 5;
        }
    }

    public static void main(String[] args) {

        enqueue(1);
        enqueue(2);
        enqueue(3);

        display();
    }
}
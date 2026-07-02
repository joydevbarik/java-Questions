public class IntersectionList {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node find(Node headA, Node headB) {

        Node a = headA;
        Node b = headB;

        while (a != b) {

            if (a == null)
                a = headB;
            else
                a = a.next;

            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = common;
        Node headB = new Node(5);
        headB.next = common;

        Node ans = find(headA, headB);

        if (ans != null)
            System.out.println("Intersection = " + ans.val);
        else
            System.out.println("No Intersection");
    }
}
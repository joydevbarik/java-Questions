public class ReverseLinkedList {


    static class Node {

        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }


    public static Node reverse(Node head){

        Node prev = null;
        Node curr = head;


        while(curr != null){

            Node next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }


        return prev;
    }



    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);


        Node result = reverse(head);


        while(result != null){

            System.out.print(result.val+" ");

            result = result.next;
        }
    }
}

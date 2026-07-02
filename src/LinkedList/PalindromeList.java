public class PalindromeList {


    static class Node{

        int val;

        Node next;


        Node(int val){

            this.val=val;
        }
    }



    static boolean check(Node head){


        String s="";


        while(head!=null){

            s+=head.val;

            head=head.next;
        }



        String rev =
                new StringBuilder(s)
                .reverse()
                .toString();



        return s.equals(rev);

    }




    public static void main(String[] args){


        Node head=new Node(1);

        head.next=new Node(2);

        head.next.next=new Node(1);



        System.out.println(
                check(head)
        );

    }
}
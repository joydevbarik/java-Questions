public class MergeTwoLists {


    static class Node{

        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }



    static Node merge(Node a, Node b){


        Node dummy = new Node(0);

        Node temp = dummy;



        while(a != null && b != null){


            if(a.val < b.val){

                temp.next=a;

                a=a.next;
            }

            else{

                temp.next=b;

                b=b.next;
            }


            temp=temp.next;
        }



        if(a != null)
            temp.next=a;

        else
            temp.next=b;



        return dummy.next;

    }



    static void print(Node head){

        while(head!=null){

            System.out.print(head.val+" ");

            head=head.next;
        }
    }



    public static void main(String[] args){


        Node a=new Node(1);

        a.next=new Node(3);

        a.next.next=new Node(5);



        Node b=new Node(2);

        b.next=new Node(4);


        Node result=merge(a,b);


        print(result);

    }
}
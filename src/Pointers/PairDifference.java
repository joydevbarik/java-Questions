public class PairDifference {

    public static void main(String[] args) {

        int[] arr={1,3,5,8,10};
        int diff=2;

        int left=0,right=1;

        while(right<arr.length){

            int d=arr[right]-arr[left];

            if(d==diff){

                System.out.println(arr[left]+" "+arr[right]);
                return;
            }

            if(d<diff)
                right++;
            else
                left++;
        }

        System.out.println("Not Found");
    }
}
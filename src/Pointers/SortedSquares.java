public class SortedSquares {

    public static void main(String[] args) {

        int[] arr={-4,-1,0,3,10};

        int[] ans=new int[arr.length];

        int left=0,right=arr.length-1;
        int k=arr.length-1;

        while(left<=right){

            if(arr[left]*arr[left]>arr[right]*arr[right]){

                ans[k--]=arr[left]*arr[left];
                left++;
            }
            else{

                ans[k--]=arr[right]*arr[right];
                right--;
            }
        }

        for(int x:ans)
            System.out.print(x+" ");
    }
}
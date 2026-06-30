public class Maximum{


    public static int maxSum(int arr[]){

        int current=arr[0];
        int max=arr[0];


        for(int i=1;i<arr.length;i++){

            current=Math.max(
                    arr[i],
                    current+arr[i]
            );


            max=Math.max(
                    max,
                    current
            );
        }


        return max;
    }


    public static void main(String[] args){

        int arr[]={-2,1,-3,4,-1,2,1};

        System.out.println(
                maxSum(arr)
        );
    }
}
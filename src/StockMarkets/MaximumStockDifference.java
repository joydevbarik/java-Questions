public class MaximumStockDifference {


    public static int maxDifference(int arr[]){

        int min=arr[0];
        int answer=0;


        for(int i=1;i<arr.length;i++){

            answer=Math.max(
                    answer,
                    arr[i]-min
            );


            min=Math.min(
                    min,
                    arr[i]
            );
        }


        return answer;
    }


    public static void main(String[] args){

        int arr[]={2,3,10,6,4,8,1};

        System.out.println(
                maxDifference(arr)
        );
    }
}
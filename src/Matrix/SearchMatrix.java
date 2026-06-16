public class SearchMatrix {

    public static void main(String[] args) {

        int[][] mat = {
                {1,3,5},
                {7,9,11},
                {13,15,17}
        };

        int target = 9;
        boolean found = false;

        for(int[] row : mat){
            for(int num : row){
                if(num == target){
                    found = true;
                    break;
                }
            }
        }

        System.out.println(found);
    }
}
public class SaddlePoint {

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        boolean found = false;

        for(int i=0;i<mat.length;i++){

            int minCol = 0;

            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j] < mat[i][minCol])
                    minCol = j;
            }

            int value = mat[i][minCol];

            boolean saddle = true;

            for(int k=0;k<mat.length;k++){
                if(mat[k][minCol] > value){
                    saddle = false;
                    break;
                }
            }

            if(saddle){
                System.out.println("Saddle Point = " + value);
                found = true;
            }
        }

        if(!found)
            System.out.println("No Saddle Point");
    }
}
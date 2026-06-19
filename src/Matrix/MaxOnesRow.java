public class MaxOnesRow {

    public static void main(String[] args) {

        int[][] mat = {
                {0,1,1},
                {1,1,1},
                {0,0,1}
        };

        int maxRow = -1;
        int maxCount = 0;

        for(int i=0;i<mat.length;i++){

            int count = 0;

            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    count++;
            }

            if(count > maxCount){
                maxCount = count;
                maxRow = i;
            }
        }

        System.out.println("Row = " + maxRow);
    }
}
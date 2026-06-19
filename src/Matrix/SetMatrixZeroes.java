public class SetMatrixZeroes {

    public static void main(String[] args) {

        int[][] mat = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(row[i] || col[j])
                    mat[i][j]=0;
            }
        }

        for(int[] r : mat){
            for(int x : r)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}
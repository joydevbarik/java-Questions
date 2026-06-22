import java.util.*;

public class Matrix1 {


    public static void main(String[] args) {


        int[][] matrix = {

                {0,0,0},
                {0,1,0},
                {1,1,1}

        };


        Queue<int[]> queue = new LinkedList<>();


        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){


                if(matrix[i][j]==0){

                    queue.add(new int[]{i,j});

                }

                else{

                    matrix[i][j] = -1;

                }

            }

        }



        int[][] direction = {

                {1,0},
                {-1,0},
                {0,1},
                {0,-1}

        };

        while(!queue.isEmpty()){


            int[] current = queue.poll();


            int r = current[0];
            int c = current[1];



            for(int[] dir : direction){


                int nr = r + dir[0];
                int nc = c + dir[1];



                if(nr>=0 && nr<rows &&
                   nc>=0 && nc<cols &&
                   matrix[nr][nc]==-1){



                    matrix[nr][nc] = matrix[r][c] + 1;


                    queue.add(new int[]{nr,nc});


                }

            }

        }
        for(int[] row: matrix){

            System.out.println(Arrays.toString(row));

        }


    }
}
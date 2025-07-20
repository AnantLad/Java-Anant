package MatrixProblem;

public class RotateImage {
    
    static void rotate90( int [][] mat){
        int n = mat.length;

        for(int i = 0; i < n /2; i++){
            for(int j = i; j < n-i-1; j++){

                int temp = mat[i][j];
                mat[i][j] = mat[n-1-j][i];
                mat[n-1-j][i] = mat[n-1-i][n-1-j];
                mat[n-1-i][n-1-j] = mat[j][n-1-i];
                mat[j][n-1-i] =temp ;
            }
        }
    }

    public static void main(String[] args) {
        int [][] mat = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };
        rotate90(mat);

        for(int[] row : mat){
            for(int x : row){
                System.out.print(x + " ");
            }
            System.out.println();
        }                  
        }
    }


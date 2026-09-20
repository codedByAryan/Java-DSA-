import java.util.*;
public class SparseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of matrix row r: ");
        int r = sc.nextInt();
        System.out.println("Enter the value of matrix column c: ");
        int c = sc.nextInt();
        int z = 0;
        int nz = 0;
        int[][] matrix = new int[r][c];
        // Matrix input from the user 
        System.out.println("Enter the elements of  matrix: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // check the matrix sparse or not
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j] == 0){
                    z++;
                }
                else{
                    nz++;
                }
            }
        }

        if(nz > z){
            System.out.println("The matrix is not a sparse matrix");
        }
        else{
            System.out.println("Sparse Matrix repersenation: ");
            int[][] s = new int[nz][3];
            int k=0;
            for(int i=0; i<r; i++){
                for(int j=0; j<c; j++){
                    if(s[i][j] != 0){
                        s[k][0] = i;
                        s[k][1] = j;
                        s[k][2] = matrix[i][j];
                        k++;
                    }
                }
            }

            System.out.println("Sparse matrix repersenattion: ");
            for(int i=0; i<nz; i++){
                for(int j=0; j<3; j++){
                    System.out.print(s[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
}

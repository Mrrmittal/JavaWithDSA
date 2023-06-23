package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Addition2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter numbers of rows for first matrix : ");
            int rows1 = sc.nextInt();//Rows for first matrix
        System.out.println("Enter numbers of rows for second matrix : ");
            int rows2 = sc.nextInt();//Rows for second matrix
            System.out.println("Enter numbers of columns :");
            int columns1 = sc.nextInt();
            int columns2 = sc.nextInt();
        //      Array for matrix first.
            int[][] matrix1 = new int[rows1][columns2];
        //      Array for matrix first.
            int[][] matrix2 = new int[rows2][columns2];
        //      Loops for input first matrix.
        System.out.println("Provide input for first matrix");
        for(int i = 0; i<rows1;i++){
            for(int j=0;j<columns1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        //      Loops for input Second matrix.
        System.out.println("Provide input for first matrix");
        for(int i = 0; i<rows2;i++){
            for(int j=0;j<columns2;j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
    // Output
        for(int i =0;i<rows1;i++){
            for(int j=0;j<columns1;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]);
            }
            System.out.println();
        }



    }
}

package Arrays;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        System.out.println("Enter Row Size : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter Column Size : ");
        int column = sc.nextInt();
        int[][] matrix = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}

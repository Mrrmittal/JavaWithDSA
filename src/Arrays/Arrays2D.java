package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner class
        System.out.println("Enter number of rows : "); //Input
        int rows = sc.nextInt();
        System.out.println("Enter number of columns : ");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers [i][j] = sc.nextInt();
            }

        }
        for(int i=0;i<rows; i++){
            for(int j=0; j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j] == x){
                    System.out.print("(" +i+ ","+j+ ")");

                }
            }
        }
    }
}

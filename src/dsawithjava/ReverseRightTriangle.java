package dsawithjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseRightTriangle {
    /* Output should print like
          *
         **
        ***
       ****
      *****  */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n : ");
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i+j>=n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package practiceofjava;

import java.util.Scanner;

public class AreaOfSquare {
    public int area(int length, int breadth){
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Provide length of square : ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Provide breadth of square : ");
        int breadth = sc.nextInt();
        AreaOfSquare myobj = new AreaOfSquare();

        System.out.println("Area will be  :" + myobj.area(length,breadth));
    }
}

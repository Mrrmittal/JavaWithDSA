package Arrays;

import java.sql.SQLOutput;
import java.util.*;

public class Initialization {
    public static void main(String[] args) {
        System.out.println("Enter the number of Subjects Marks you want to store : ");
        Scanner sc = new Scanner(System.in);
        int Subject = sc.nextInt();
        System.out.println(Subject);
        int[] Marks = new int[6];
        System.out.println("Enter list of marks : ");
        for(int i = 0; i<= Subject; i++) {
            Marks[i] = sc.nextInt();
        }
            System.out.println("Elements of Arrays are :" );
        for(int i =0;i<Subject;i++){
            System.out.println(Marks[i]);
        }

    }


}

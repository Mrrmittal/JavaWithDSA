package exceptionhandling;
import java.util.*;

public class ArraysBound {
    public static void main(String[] args) {
        int marks[]= new int [90];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hindi Marks");
        int Hindi = sc.nextInt();
        System.out.println("Enter English Marks");
        int English = sc.nextInt();
        System.out.println("Enter Maths Marks");
        int Maths = sc.nextInt();


        try{
            System.out.println(marks[2]);
        }
        catch (Exception e){
            System.out.println("Error found");
            System.out.println(e);
        }
    }
}

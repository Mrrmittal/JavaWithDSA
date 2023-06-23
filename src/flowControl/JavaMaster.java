package flowControl;
import java.util.*;

public class JavaMaster {
    public void fail(){
        System.out.println("Try Again!");
    }
    public boolean check(int marks, int limit){
        if(marks<=limit){
            return true;
        }else{
            return false;
        }
    }
    public void pass(){
        System.out.println("Java Master!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        int passingMarks = sc.nextInt();
        JavaMaster myStudent = new JavaMaster();

        if(myStudent.check(marks,passingMarks)){
            myStudent.fail();
        }else{
            myStudent.pass();
        }

    }
}

package Main.Lecture_11;
/*
Que: What is Block Scope?
Sol: Block scope is basically lies under a method or a class. Block scope set a local variable that can be accessible
     only in the block. Block scope can modified the global variable. because pass by reference of variable work here.
     Block scope support variable pass by reference.

     Syntax : { //Code Here }
     for eg:
 */
public class BlockScope{
    public static void main(String[] args) {
        int a = 10;

        {
//            int a = 100;  can not initialize again variable "a". Because variable pass by reference
              a = 100;        // Yes, you can modify the reference variable in Block scope.
              int b = 50;     // This is the local variable for this block only. we can use it outside the scope.
            System.out.println(a); //print 100
            System.out.println(b); //print 50
        }


        System.out.println(a);   // print 100, Because the value of variable "a" modify by Block scope.
//        System.out.println(b); throw error, Because b only use in the Block Scope;
    }
}

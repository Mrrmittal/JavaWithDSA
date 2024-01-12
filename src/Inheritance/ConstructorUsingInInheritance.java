package Inheritance;

class demo1 {
    int m,n;

    public demo1(){   //Zero param constructor
        //Super();
        System.out.println("Parent class constructor");
    }

    public demo1(int n, int m){   //Parameterized constructor
        //Super();
        System.out.println("Parents class param constructor");
    }
}

class demo2 extends demo1{
    public demo2(){
        //Super();   In constructor there are always a super method that always first calls their parent constructor and then call their child constructor
        // so, Here when demo2 object will create than the non param constructor will be call by the demo2() constructor.
        System.out.println("Child class Constructor");
    }

    public demo2(int m, int n){
        //Super();

        System.out.println("Child class param constructor");
    }
}

public class ConstructorUsingInInheritance{
    public static void main(String[] args) {
        demo2 obj = new demo2();
    }


}
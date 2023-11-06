package practiceofjava;

public class constructor_overloading {
    public String name;
    private int age;
    public constructor_overloading(){
//        this is zero parameterized constructor
        name = "Rohit Mittal";
        age = 32;
    }
    public constructor_overloading(String name){
//        this is one parameterized constructor
        age = 23;
        this.name = name;
    }
    public constructor_overloading(String name,int age){
//        this is two parameterized constructor
        this();
        this.age=age;
        this.name=name;
    }
    public void disp(){
        System.out.println("My name is "+ name + " And my age is " +age );
    }
    public static void main(String[] args) {
        constructor_overloading myObj1 = new constructor_overloading();
        constructor_overloading myObj2 = new constructor_overloading("Mohit Mittal");
        constructor_overloading myObj3 = new constructor_overloading("Jatin Mittal", 22);
        myObj1.disp();
        myObj2.disp();
        myObj3.disp();
    }
}

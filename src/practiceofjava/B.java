package practiceofjava;
//Class B used method of Class A, Because method of Class A has access to another class B.
public class B extends A{
    public void breath(){
        System.out.println("Living organisms can breath");
    }
    public static void main(String[] args) {

        B myobj2 = new B();
        B myobj3 = new B();
        myobj2.eat();
        myobj3.breath();
    }
}

package InnerClass.MemberInnerClass;

class A{
    public void show(){
        System.out.println("Please Show");  // A class member method
    }
//    Create a B class which is the inner class for A
    class B{
        public void display(){
            System.out.println("Please Display");
        }
    }
}
public class demo {
    public static void main(String[] args) {
        A obj = new A(); //obj is the object for class A.
//      For creation of obj B class we used the obj reference of class because B class is the member funtion of Class "A"
        A.B obj1 = obj.new B();

//      Now you can both method which is in A class
        obj.show();
        obj1.display();
    }
}

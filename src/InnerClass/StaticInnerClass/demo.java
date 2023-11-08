package InnerClass.StaticInnerClass;

class A{
    public void show(){
        System.out.println("Please Show");
    }

//    Static inner class
        static class B{
        public void display(){
            System.out.println("Please Display");
        }
    }
}
public class demo {
    public static void main(String[] args) {
//        Create class "A" Object
        A obj = new A();
//        Create Class B object when class is static so there is no need of obj of Class "A" but only reference
        A.B obj1 = new A.B();

        obj.show();
        obj1.display();
    }
}

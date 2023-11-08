package InnerClass.AnnonymousInnerClass;
@FunctionalInterface
interface Car{
    void drive();
        }
//class maruti implements A{
//    public void drive(){
//        System.out.println("Can Drive");
//    }
//}
// In Anonymous class you do not need to create

public class demo {
    public static void main(String[] args) {
        Car obj = new Car(){ // Here an interface car obj isn't create, But object of annonymous class object is created
            public void drive(){
                System.out.println("Can drive");
            }
        };
//        This Anonymous class used in the Concept of Lambda Expressions
        obj.drive();
    }
}

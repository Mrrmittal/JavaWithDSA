package practiceofjava;

class Animals {
    public void eat(){ //let suppose if this mathod is final
        System.out.println("Animals can eat");
    }
    public void makeSound(){
        System.out.println("Animals can make sound");
    }
}

public class Dog extends Animals{
    public void eat(){ //then here we cannot override this method of Animals
        System.out.println("Dog eats Dogs Food");
    }

    public static void main(String[] args) {
        Animals myobj = new Animals();
        Dog myobj2 = new Dog();
        myobj.eat();
        myobj2.eat();
        myobj.makeSound();
    }

}


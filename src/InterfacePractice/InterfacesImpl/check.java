package InterfacePractice.InterfacesImpl;

import InterfacePractice.Animals;

class Tiger implements Animals {

    @Override
    public void eat() {
        System.out.println("Tiger Eats flash");
    }

    @Override
    public void speak() {
        System.out.println("Tigers Growls");
    }

}

class Lion implements Animals{

    @Override
    public void eat() {
        System.out.println("Lions eats meat");
    }

    @Override
    public void speak() {
        System.out.println("Lions Roars");
    }
}

class Jungle{
    public void poly(Animals obj){
        obj.eat();
        obj.speak();
    }
}

public class check{
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Jungle animals = new Jungle();

        animals.poly(tiger);
        animals.poly(lion);
    }
}
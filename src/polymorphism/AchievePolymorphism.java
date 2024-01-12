package polymorphism;

class Animal{
    public void eat(){
        System.out.println("Animals Can eat");
    }

    public void speak(){
        System.out.println("Animals can bark");
    }
}

class Tiger extends Animal{
    @Override
    public void eat(){
        System.out.println("Tiger eat flash");
    }

    @Override
    public void speak(){
        System.out.println("Tiger Growls");
    }
}

class Lion extends Animal{
    @Override
    public void eat(){
        System.out.println("Lions eat dears");
    }

    @Override
    public void speak(){
        System.out.println("Loins Roar");
    }
}

class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dogs eat cats");
    }

    @Override
    public void speak(){
        System.out.println("Dogs Barks");
    }
}

class Jungle{
    public void poly(Animal obj){
        obj.eat();
        obj.speak();
        System.out.println("************************************************");
    }
}


public class AchievePolymorphism {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Dog dog = new Dog();
        Jungle animals = new Jungle();

        animals.poly(tiger);
        animals.poly(lion);
        animals.poly(dog);
    }

}

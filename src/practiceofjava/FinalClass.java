package practiceofjava;

 class Abc {
    final void eat() {
        System.out.println("ABC");
    }
}

    public class FinalClass extends Abc{

     public static void main(String[] args) {
        Abc myobj = new FinalClass();
        myobj.eat();

    }
}

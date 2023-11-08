package InterfacePractice.InterfacesImpl;


//Implementation of demo interface

import InterfacePractice.demo;

public class abc implements demo {
    @Override
    public void demoMethod(int num, String status) {

        System.out.println("Num is :" +num +" Status is : " +status);

    }
    public static void main(String[] args) {
//        System.out.println(demo.a); //To print interface a value which is final and cannot change.
        demo obj = new abc(); // Object make through the class here not by the interface
        abc obj2 = new abc();

        obj.demoMethod(78,"Pass");
        obj2.demoMethod(85,"Pass");

    }
}

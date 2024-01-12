package Collections.Queue.ArrayDeque;

import java.util.ArrayDeque;

public class IsExist {

    public void isElementExists(ArrayDeque arrayDeque, String element){
        if(arrayDeque.contains(element)){
            System.out.println("Element Exists");
        }
        else{
            System.out.println("Element doesn't Exists");
        }
    }

    public static void main(String[] args) {

        IsExist myObj = new IsExist();
        ArrayDeque arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast("Apple");
        arrayDeque.addLast("Banana");
        arrayDeque.addLast("Pineapple");

        myObj.isElementExists(arrayDeque,"Mango");
    }
}

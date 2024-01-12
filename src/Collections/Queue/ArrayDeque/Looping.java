package Collections.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Looping {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast("Apple");
        arrayDeque.addLast("Banana");
        arrayDeque.addLast("Pineapple");

//        Using For each Loop
        for (Object element : arrayDeque){
            System.out.println(element);
        }
        System.out.println("*********************");
//        Using While Loop
        System.out.println("By using while Loop as an object");
        Iterator iterator = arrayDeque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()); // Data fetch in the form of object
        }

        //        Using While Loop
        System.out.println("By storing as an datatype");
        Iterator itr = arrayDeque.iterator();
        while(itr.hasNext()){
            String itr2 = (String) itr.next();
            System.out.println(itr2);
        }

    }
}

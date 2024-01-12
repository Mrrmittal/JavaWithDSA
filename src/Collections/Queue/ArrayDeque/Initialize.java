package Collections.Queue.ArrayDeque;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class Initialize {

    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();

//        We can only add element from front and rear end in ArrayDeque
        arrayDeque.addFirst(100);
        arrayDeque.addFirst(200);
        arrayDeque.addFirst(700);
        arrayDeque.addFirst(900);
        arrayDeque.addFirst(700);
        arrayDeque.addFirst(100);
        arrayDeque.addLast(1);

//      ArrayDeque doesn't support indexing. So we can't add in between the elements
        System.out.println(arrayDeque);



    }
}

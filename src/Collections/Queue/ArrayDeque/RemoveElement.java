package Collections.Queue.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Collections;

public class RemoveElement {
//    Remove an element in ArrayDeque

    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();

        arrayDeque.addFirst(122);
        arrayDeque.addLast(456);
        arrayDeque.addLast(458);
        arrayDeque.addLast(458); //ArrayDeque Support duplicate elements

        arrayDeque.remove(456); // We can remove element by direct pass but remove with using index value is not allowed

        System.out.println(arrayDeque);

        //        Remove all element
        arrayDeque.removeAll(arrayDeque);

        System.out.println(arrayDeque);
    }
}

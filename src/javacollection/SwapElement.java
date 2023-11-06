package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);

        Collections.swap(list,0,3);
        System.out.println(list);
    }
}

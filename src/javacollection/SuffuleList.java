package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class SuffuleList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);

        Collections.shuffle(list);
        System.out.println(list);
    }
}

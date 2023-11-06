package javacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        list2.add(22);

        ArrayList<String> list3 = new ArrayList<String>();

        for (Integer e : list)
            list3.add(list2.contains(e) ? "Yes" : "No");
        System.out.println(list3);

    }
}

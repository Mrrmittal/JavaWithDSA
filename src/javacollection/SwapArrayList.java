package javacollection;

import java.util.ArrayList;

public class SwapArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);
        list.add(12);
        list2.add(14);
        list2.add(16);
        list2.add(18);
        list2.add(20);
        list2.add(22);
        list2.add(24);

        ArrayList<Integer> swap;
        swap = list;
        list=list2;
        list2=swap;
        System.out.println(list);
        System.out.println(list2);
    }
}

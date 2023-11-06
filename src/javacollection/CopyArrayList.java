package javacollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(10);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(14);
        list2.add(16);
        list2.add(18);
        list2.add(20);


        Collections.copy(list,list2);
//        for(int i=0;i<list2.size();i++){
            System.out.println(list);
//        }
    }
}

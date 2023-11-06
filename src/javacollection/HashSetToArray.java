package javacollection;

import java.util.*;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(25);
        set.add(125);
        set.add(625);

        int[] arr = new int[set.size()];
        set.toArray();

        for(int val : arr){
            System.out.println(val);
        }


    }
}

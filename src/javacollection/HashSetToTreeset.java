package javacollection;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(25);
        set.add(125);
        set.add(625);

        TreeSet<Integer> tree_set = new TreeSet<>(set);
        for(int val : tree_set){
            System.out.println(val);
        }
    }
}

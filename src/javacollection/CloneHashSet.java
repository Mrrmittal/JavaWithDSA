package javacollection;

import java.util.HashSet;

public class CloneHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(25);
        set.add(125);
        set.add(625);

        HashSet<Integer> set1 = new HashSet<>();
        set1 = (HashSet)set.clone();
        System.out.println(set1);
        System.out.println(set);
    }
}

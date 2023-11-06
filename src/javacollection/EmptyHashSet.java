package javacollection;

import java.util.HashSet;

public class EmptyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(25);
        set.add(27);

        set.removeAll(set);

        System.out.println(set);
    }
}

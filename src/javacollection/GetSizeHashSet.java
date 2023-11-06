package javacollection;

import java.util.HashSet;

public class GetSizeHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(25);
        set.add(18);
        set.add(39);
        set.add(57);
        set.add(78);

        System.out.println(set.size());
        System.out.println(set);

    }
}

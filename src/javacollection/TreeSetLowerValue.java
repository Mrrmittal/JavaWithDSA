package javacollection;

import java.util.TreeSet;

public class TreeSetLowerValue {
    public static void main(String[] args) {
        TreeSet<Integer> colors = new TreeSet<>();
        colors.add(12);
        colors.add(14);
        colors.add(567);
        colors.add(687);

        System.out.println(colors.lower(15));
    }
}

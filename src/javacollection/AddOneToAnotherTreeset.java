package javacollection;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class AddOneToAnotherTreeset {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");

        TreeSet<String> colors2 = new TreeSet<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        colors.addAll(colors2);
        System.out.println(colors);

    }
}

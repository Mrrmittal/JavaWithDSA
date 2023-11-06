package javacollection;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class CloneTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        System.out.println("Orginal TreeSet is : "+ colors);

        TreeSet<String> colors2 = (TreeSet<String>) colors.clone();
        System.out.println("Cloned TreeSet is : " + colors2);


    }
}

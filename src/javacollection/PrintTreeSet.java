package javacollection;

import java.util.Iterator;
import java.util.TreeSet;

public class PrintTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        Iterator e = colors.iterator();
        while(e.hasNext()){
            System.out.println(e.next());
        }
    }
}

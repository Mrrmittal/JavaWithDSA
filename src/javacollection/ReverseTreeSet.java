package javacollection;

import java.awt.*;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        Iterator it = colors.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }

}

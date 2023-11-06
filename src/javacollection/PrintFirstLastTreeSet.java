package javacollection;
import java.util.*;

public class PrintFirstLastTreeSet {
    public static void main(String[] args) {
        TreeSet<String > colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        System.out.println("First Element is : "+ colors.first());
        System.out.println("Last Element is : "+ colors.last());
    }
}

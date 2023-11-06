package javacollection;

import java.util.TreeSet;

public class CompareTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Pink");
        colors.add("Green");
        colors.add("Blue");

        TreeSet<String> colors2 = new TreeSet<>();
        colors2.add("Red");
        colors2.add("Pink");
        colors2.add("Green");
        colors2.add("Blue");

        for(String val : colors){
            if(colors2.contains(val)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }


    }
}

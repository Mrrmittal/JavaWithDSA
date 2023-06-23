package Strings;

import java.util.*;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder Name = new StringBuilder("Jatin Mittal");
        System.out.println(Name.charAt(0));
        System.out.println(Name);
        try {
            Name.setCharAt( 0,'N');
            Name.setCharAt(1,'i');
            System.out.println(Name);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Name.insert(Name.length(), " is a Nice Guy!");
        System.out.println(Name);

        Name.delete(0, 5);
        System.out.println(Name);

    }
}

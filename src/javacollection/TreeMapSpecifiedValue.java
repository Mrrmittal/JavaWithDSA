package javacollection;

import java.util.*;

public class TreeMapSpecifiedValue {
    public static void main(String[] args) {
        TreeMap<String ,Integer> map1 = new TreeMap<>();
        map1.put("ABC", 240);
        map1.put("USA", 50);
        map1.put("China", 150);
        map1.put("Indonesia", 70);
        map1.put("Pakistan", 60);

        System.out.println(map1.get("ABC"));

        for(Map.Entry<String,Integer> e: map1.entrySet()){
            System.out.println(e.getKey() + "=" + e.getValue());
        }

    }
}

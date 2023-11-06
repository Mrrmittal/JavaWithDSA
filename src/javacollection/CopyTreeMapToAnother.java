package javacollection;

import java.util.*;

public class CopyTreeMapToAnother {
    public static void main(String[] args) {
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("ABC", 240);
        map1.put("USA", 50);
        map1.put("China", 150);
        map1.put("Indonesia", 70);
        map1.put("Pakistan", 60);

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.putAll(map1);

        System.out.println(map2);
    }
}

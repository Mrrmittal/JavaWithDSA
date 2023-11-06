package javacollection;

import java.util.*;

public class AddOneMapToAnotherHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("India", 140);
        map1.put("USA", 50);
        map1.put("China", 150);
        map1.put("Indonesia", 70);
        map1.put("Pakistan", 60);

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("Qatar", 40);
        map2.put("Japan", 60);
        map2.put("Kuwait", 90);
        map2.put("Indo-China", 170);
        map2.put("Russia", 100);

        map1.putAll(map2);
        System.out.println(map1);

    }
}

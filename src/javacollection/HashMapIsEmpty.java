package javacollection;

import java.util.HashMap;

public class HashMapIsEmpty {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("India", 140);
        map1.put("USA", 50);
        map1.put("China", 150);
        map1.put("Indonesia", 70);
        map1.put("Pakistan", 60);

        boolean result = map1.isEmpty();
        System.out.println(result);

        map1.clear();
        boolean result2 = map1.isEmpty();
        System.out.println(result2);

    }
}

package javacollection;

import java.util.HashMap;
import java.util.Map;

public class RemoveAllElement {
    public static void main(String[] args) {

        Map myMsp = new HashMap();
        myMsp.put(1,"Hello");
        myMsp.put("Hello", 123);

//        myMsp.forEach( (k,v) -> {
//            System.out.println(k + " " + v);
//        });

        for(Object e : myMsp.entrySet()){
            System.out.println(e);

        }

        Map<String,Integer> map1 = new HashMap<>();
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
        map1.clear();
        System.out.println(map1);
    }
}

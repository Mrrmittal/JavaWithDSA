package javacollection;

import java.util.HashMap;
import java.util.Map;

public class ContainSpecifiedKey {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("India", 140);
        map1.put("USA", 50);
        map1.put("China", 150);
        map1.put("Indonesia", 70);
        map1.put("Pakistan", 60);

        if(map1.containsKey("India")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

package javacollection;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap< String,Integer> map = new HashMap<>();
//        Countries with there population in Crores
        map.put("India",140);
        map.put("Pakistan", 70);
        map.put("China", 160);
        map.put("Russia", 60);
        map.put("USA", 30);
        map.put("Australia",20);

        System.out.println(map);

//        Check Indonesia is in the list or not
        if(map.containsKey("Indonesia")){
            System.out.println("Key present");
        }else{
            System.out.println("Key is not present");
        }
//      Update India population
        map.put("India", 141);
        System.out.println(map);
//      To get value if key exists or not exists
        System.out.println(map.get("China"));
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

    }
}

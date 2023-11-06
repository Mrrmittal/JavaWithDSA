package javacollection;
import java.util.*;

public class HashMapIteration {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",140);
        map.put("Pakistan", 70);
        map.put("China", 160);
        map.put("Russia", 60);
        map.put("USA", 30);
        map.put("Australia",20);


        for(Map.Entry <String,Integer> e : map.entrySet()){
            System.out.println(e);
        }
    }
}

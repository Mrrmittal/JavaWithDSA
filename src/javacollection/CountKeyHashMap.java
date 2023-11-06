package javacollection;
import java.util.*;
public class CountKeyHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> populationDB = new HashMap<>();
        populationDB.put("India", 140);
        populationDB.put("USA", 50);
        populationDB.put("China", 150);
        populationDB.put("Indonesia", 30);
        populationDB.put("Australia", 40);

        populationDB.size();
        System.out.println(populationDB.size());


    }
}

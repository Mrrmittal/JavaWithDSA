package javacollection;
import java.util.HashSet;
import java.util.Iterator;

public class CheckEmptyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(25);
        set.add(12);
        set.add(23);


            if(set.isEmpty()){
                System.out.println("Empty");
        }
            else{
                System.out.println("Non Empty");
            }
    }
}
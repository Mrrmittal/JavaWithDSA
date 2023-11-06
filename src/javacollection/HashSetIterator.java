package javacollection;
import java.util.*;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(7);
        set.add(4);

        Iterator it = set.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    }

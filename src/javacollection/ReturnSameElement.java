package javacollection;

import java.util.HashSet;

public class ReturnSameElement {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(510);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(40);
        set2.add(50);

        for(int val : set1){
            if(set2.contains(val)){
                System.out.println(val);
            }
        }
    }
}

package javacollection;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);  //Add Elements in HashSet

//  To Print size of the set - HashSet have a set of unique elements no duplication count here.
        System.out.println(set.size());
//  To Print element of set
        System.out.println(set);
//  To Remove the element from the set
        System.out.println(set.remove(1));
//  Print set again after remove element
        System.out.println(set);
//  To check contain 4 or not
        if(set.contains(4)){
            System.out.println("Set contrains 4 ");
        }else{
            System.out.println("Set does't contain 4 ");
        }
    }
}

package javacollection;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;


public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> name = new ArrayList<String>();
//     Add element in Array
        list.add(0);
        list.add(2);
        list.add(3);
        list.add(5);
        name.add("Jatin");
        name.add("Nikku");
        name.add("Mukul");
        name.add("Tukku");

        System.out.println(list);
        System.out.println(name);

//      Get element from the Array
        int element = list.get(2);
        String word = name.get(2);
        System.out.println(element);
        System.out.println(word);

//        Remove from the Array
        list.remove(2);
        name.remove(2);
        System.out.println(list);
        System.out.println(name);

//      Add element at Random index
        list.add(2,3);
        name.add(2,"Mukul");
        System.out.println(list);
        System.out.println(name);

//        To change the data in present Array
        list.set(3,4);
        name.set(1,"Nitesh");
        System.out.println(list);
        System.out.println(name);

//        Sorting in Array
        Collections.sort(list);
        Collections.sort(name);

        System.out.println(list);
        System.out.println(name);
//  Loop in Array
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) +" ");
        }
        System.out.println();
        for(int i=0;i<name.size();i++){
            System.out.print(name.get(i) +" ");
        }

    }

}

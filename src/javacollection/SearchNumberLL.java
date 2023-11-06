package javacollection;

import java.util.LinkedList;

public class SearchNumberLL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


//        Search index for 7
        System.out.println("Index of given number is : ");
        for(int i=0;i<list.size();i++){
            if(list.get(i)==7){
                System.out.println(i);
            }
        }
    }
}

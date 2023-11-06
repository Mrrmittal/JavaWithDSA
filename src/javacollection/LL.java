package javacollection;

import java.util.LinkedList;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

//        To add data in Linked List
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

//      Add from the last
        list.add("Linked");
        list.addLast("List");


//        Size for the linked list
        list.size();
        System.out.println(list.size());

//        To remove data from linked list
        list.remove(3);
        System.out.println(list.size());

//        To set data in linked

//        Use loop on the Linked List
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.print(" Null ");
        System.out.println();

//        To set data in linked list
        list.set(0,"These");
        list.set(1,"are");
        list.set(2,"Linked");

        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println(" Null");



    }
}

package Collections.List.LinkedList;

import java.util.LinkedList;

public class CheckIsEmptyOrNot {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(100);
        linkedList.addFirst(2210);
        linkedList.addFirst(2130);
        linkedList.addFirst(1320);

        if(linkedList.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }
}

package dsawithjava;

import java.util.ArrayList;
import java.util.Stack;

public class StackPlates {
    static class Stack{
        static ArrayList <String> list = new ArrayList<String>();
        public static boolean isEmpty(){
            return list.size()==0;
        }

//        To push plates one by one
        public static void push(String data){
            list.add(data);
        }

//        To remove plate one by one
        public static String  pop(){
            String top = list.get(list.size()-1);
            if(isEmpty()){
                return "Empty";
            }
            list.remove(list.get(list.size()-1));
            return top;
        }
//        To get peek
        public  static String peek(){
            if(isEmpty()){
                return "Empty";
            }
            return list.get(list.size()-1);
        }


    }
    public static void main(String[] args) {
        Stack plates = new Stack();
        plates.push("Plate1");
        plates.push("Plate2");
        plates.push("Plate3");
        plates.push("Plate4");
        plates.push("Plate5");

        while(!plates.isEmpty()){
            System.out.println(plates.peek());
            plates.pop();

        }
    }
}

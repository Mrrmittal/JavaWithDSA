package dsawithjava;
import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        static ArrayList <Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
//        To push element in Stack
        public static void push(int data){
            list.add(data);
        }

//      To Pop element in Stack
        public static int pop(){
            int top = list.get(list.size()-1);
            if(isEmpty()){
                return -1;
            }
            list.remove(list.size()-1);
            return top;
        }

//        peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }


    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }
}

package dsawithjava;
import java.util.Stack;
import java.util.Collections;

public class StackCollection {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }



    }
}

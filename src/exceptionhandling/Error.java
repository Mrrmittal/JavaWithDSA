package exceptionhandling;

public class Error {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception w){
            System.out.println("Cannot print");
            System.out.println(w);
        }
        System.out.println("Hello");
    }

}

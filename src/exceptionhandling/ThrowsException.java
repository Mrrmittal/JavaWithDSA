package exceptionhandling;

import java.io.IOException;

public class ThrowsException {
    public void a(){
        try {
            b();
        }
        catch (Exception e){
            System.out.println("Please check inputs");
//            e.printStackTrace();
            System.out.println(e);
        }

    }

    public void b()  throws IOException {
        int a = 10;
        int b = 0;
        int result = a/b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        ThrowsException obj = new ThrowsException();
        obj.a();
    }
}

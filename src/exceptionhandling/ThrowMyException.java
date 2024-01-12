package exceptionhandling;

class MyException extends Exception{

    public  MyException(){}
    public  MyException(String msg){
        super(msg);
    }
}

public class ThrowMyException {
    public static void main(String[] args) {
        int num = 6;
        int num2 = -2;
        try {
            if (num2 < 0) {
                Exception e = new MyException("Negative Number");
                throw e;
            } else {
                double result = num / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Invalid Number" + e);
        }
    }
}

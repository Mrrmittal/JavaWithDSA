package exceptionhandling;
// Throw Keyword are basically use while we need to call catch block by using its object

public class ThrowKeyword {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = -2;

        try {
            if(num2 < 0){
//                You can't divide any number by negative value
                Exception obj =new Exception();
                throw obj;
            }else{
                float result = num1/num2;
                System.out.println(result);
            }
        }
        catch (Exception obj){
            System.out.println("Please Enter valid number");
        }
    }
}

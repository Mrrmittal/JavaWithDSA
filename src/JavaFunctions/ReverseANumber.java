package JavaFunctions;

public class ReverseANumber {

    public void reverse(int num1){
        int reversed = 0;
        System.out.println("Number was : " +num1);
        while (num1!=0){
            int digit = num1%10;
            reversed = reversed*10 + digit;
            num1 /= 10;
        }
        System.out.println("Number after reversed : "+reversed);
    }

    public static void main(String[] args) {
        ReverseANumber obj = new ReverseANumber();
        obj.reverse(12345);
    }
}

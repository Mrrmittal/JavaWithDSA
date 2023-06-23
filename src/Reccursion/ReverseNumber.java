package Reccursion;

public class ReverseNumber {
    public static void printNumber(int number, int reverse){
        if(number==0){
            System.out.println(reverse);
            return;
        }
        int i = number%10;
        reverse = reverse*10+i;

        printNumber(number/10,reverse);
    }
    public static void main(String[] args) {
        int number = 12345;
        printNumber(number,0);
    }
}

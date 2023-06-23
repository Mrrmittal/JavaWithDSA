package Reccursion;

public class PrintReverseNumber {
    public static void printNumber(int number, int sum){
        if(number==0){
            System.out.println(sum);
            return;
        }


        System.out.println(number);
        sum += number;
        printNumber(number-1,sum);

    }

    public static void main(String[] args) {
        printNumber(5,0);

    }

}

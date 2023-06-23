package practiceofjava;

public class ReverseNumber {
    public static void main(String[] args) {
        long number = 5757576;
        for(int i=0;i<7;i++) {
            long reverse = number % 10;
            number = number/10;
            System.out.print(reverse);
        }
    }
}

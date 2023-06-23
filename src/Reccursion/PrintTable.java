package Reccursion;

public class PrintTable {
    public static void Table(int number, int multiples){
//        System.out.println("Enter a number ");
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int multiples = sc.nextInt();
        if(multiples == 11){
            return;
        }
        System.out.println(number * multiples);
        Table(number,multiples+1);
    }
    public static void main(String[] args) {
        Table(9,1);
    }
}

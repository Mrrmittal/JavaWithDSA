package practiceofjava;
import java.util.Scanner;

public class IntergersSeries {
//    public void series1(int a,int b,int c){
//        int output = a;
//        for(int i =0; i<c;i++){
//           output += (Math.pow(2,i)*b);
//            System.out.print(output +" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        IntergersSeries myobj = new IntergersSeries();
//        myobj.series1(0,2,10);
//        myobj.series1(5,5,5);
//    }
//}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan1.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
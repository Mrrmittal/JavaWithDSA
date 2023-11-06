package practiceofjava;

public class demo {

    int a = 100;
    int b = 200;
    {
        System.out.println("sum of a and b is " + (a+b));
    }

    

    {
        System.out.println("sum of a and b is " + (a-b));
    }
    static int m = 50;
    static int n = 70;
    static {
        System.out.println("sum of a and b is " + (m+n));
    }
    public static void main(String[] args) {
        demo obj = new demo();
        demo obj2 = new demo();
        demo obj3 = new demo();
        demo obj4 = new demo();
    }
}

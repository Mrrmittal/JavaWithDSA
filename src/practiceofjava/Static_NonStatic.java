package practiceofjava;

public class Static_NonStatic {
    static int a;
    static int b;
    int m;
    int n;

    static {
        a = 42;
        b= 49;
//        m = 67 we can not initialize m here because m is not static
    }
//    Non_Static block
    {
        m = 56;
        n = 78;
    }

    static void disp1(){
        System.out.println(a);
        System.out.println(b);
    }

    public  void disp2(){
        System.out.println(m);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Static_NonStatic myObj = new Static_NonStatic();
        Static_NonStatic.disp1(); //We can call static method direct with the class name
        myObj.disp2(); //But there is always need a obj to call non_static method
    }
}

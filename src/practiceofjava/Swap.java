package practiceofjava;

public class Swap {
    int a = 5;
    int b= 6;
    int temp;
    public void swap(){
        temp=a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Swap myobj = new Swap();
        myobj.swap();

    }
}

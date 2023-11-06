package threads;

public class WithThread {
    public static void main(String[] args) {
        Thread1 myThread1 = new Thread1();
        Thread2 myThread2 = new Thread2();

        myThread1.start();
        myThread2.start();

    }
}

package threads;

public class GetThreadID {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        System.out.println("Thread1 id is : " +t1.getId());
        System.out.println("Thread2 id is : " +t2.getId());
    }
}

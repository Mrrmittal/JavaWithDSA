package threads;
class Thread3 implements Runnable{
    @Override
    public void run(){
        System.out.println("I am a thread3");
        System.out.println("I am running now");
    }
}
class Thread4 implements Runnable{
    @Override
    public void run(){
        System.out.println("I am a thread4");
        System.out.println("I am running now");
    }
}

public class WithRunnableInterface {
    public static void main(String[] args) {
        Thread3 myThread = new Thread3();
        Thread4 myThread2 = new Thread4();

        Thread t1 = new Thread(myThread,"1");
        Thread t2 = new Thread(myThread2,"2");

        t1.start();
        t2.start();
    }
}

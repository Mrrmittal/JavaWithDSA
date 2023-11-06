package threads;

public class MyThreads extends Thread{
    public void run(){
        System.out.println("This is a Thread");
    }

    public static void main(String[] args) {
        MyThreads t = new MyThreads();
        t.start();
    }
}

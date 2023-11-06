package threads;
class OneThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
//
        System.out.println("Thread name is "+ Thread.currentThread().getName());
    }
}
public class RunnableMethod {
    public static void main(String[] args) {
        OneThread t1 = new OneThread();
        Thread myThread = new Thread(t1);
        myThread.setName("Running Thread");
        myThread.start();
    }
}

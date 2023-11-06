package threads;
class myFirstThread extends Thread{
    public void run(){
        System.out.println("Thread" + Thread.currentThread().getName()+ " is running");
    }
}
public class SetPriorityThreads {
    public static void main(String[] args) {
        myFirstThread t1 = new myFirstThread();
        myFirstThread t2 = new myFirstThread();
        myFirstThread t3 = new myFirstThread();
        myFirstThread t4 = new myFirstThread();
        myFirstThread t5 = new myFirstThread();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t4.setName("Thread4");
        t5.setName("Thread5");
        t5.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

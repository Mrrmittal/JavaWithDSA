package threads;
class MyThread21 implements Runnable{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Thread "+Thread.currentThread().getName() + " is running");
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
            }
        }
    }
}
public class ThreadSleep {
    public static void main(String[] args) {
        MyThread21 t1 = new MyThread21();
        Thread myThread1 = new Thread(t1, "Jatin");
        Thread myThread2 = new Thread(t1,"ABC");
        Thread myThread3 = new Thread(t1,"EFG");

        myThread1.start();
        try{
            myThread1.join(1000);
        }catch (InterruptedException e){

        }
        myThread2.start();
        myThread3.start();

    }
}

package threads;

public class Thread1 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread1 is running");
            System.out.println("I am Happy");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Thread2 is also running to print ");
            System.out.println("I am still Happy");
        }
    }
}

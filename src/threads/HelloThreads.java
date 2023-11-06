package threads;

class Hello extends Thread{

    public void run(){
        System.out.println("Hello Thread");
    }

    public void run(String name){
        System.out.println("Hello " +name);
    }
}

public class HelloThreads {
    public static void main(String[] args) {
        Hello t1 = new Hello();
        Hello t2 = new Hello();
        t2.run("Jatin");
        t1.start();
    }
}

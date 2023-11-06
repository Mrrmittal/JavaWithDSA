package threads;

class ThreadsWithConstructor1 extends Thread{
    String name;
    int age;

    ThreadsWithConstructor1(String name, int age){
            this.name = name;
            this.age = age;
    }

    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My name is : " +name +" "+ "and my age is : "+age);
            i++;
        }

    }
}


class ThreadsWithConstructor2 extends Thread{
    String name;
    int age;

    ThreadsWithConstructor2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My name is : " +name + " " + "and my age is : " + age);
            i++;
        }

    }
}

public class ThreadsWithConstructor{
    public static void main(String[] args) {
        ThreadsWithConstructor1 t1 = new ThreadsWithConstructor1("Cheenu", 22);
        ThreadsWithConstructor2 t2 = new ThreadsWithConstructor2("Chirag", 21);
        t1.start();
        t2.start();

    }
}
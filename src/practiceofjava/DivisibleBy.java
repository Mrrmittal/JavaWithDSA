package practiceofjava;

public class DivisibleBy {
    public static void divisibleBy5(){
        System.out.println("Numbers are Divisible by 5 : ");
        for(int i =1; i<100;i++){
            if(i%5==0){
                System.out.print(i + ",  ");
            }
        }
    }
    public static void divisibleBy3(){
        System.out.println("Numbers are Divisible by 3 : ");
        for(int i =1; i<100;i++){
            if(i%3==0){
                System.out.print(i + ",  ");
            }
        }
    }

    public static void main(String[] args) {
        divisibleBy5();
        divisibleBy3();
    }
}

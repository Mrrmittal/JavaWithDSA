package practiceofjava;

import java.util.Scanner;

class farmer {
    int principal;
   static float rate =15.0f; //Because rate will be the same for all the farmers
    float time;
    float si;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your required amount");
        principal = sc.nextInt();
        System.out.println("Please enter your required time");
        time = sc.nextFloat();


    }

    void compute(){
        si = (principal*time*rate)/100f;
    }

    void display(){
        System.out.println("SI will be : " +si);
    }
}
public class SimpleInterest {
    public static void main(String[] args) {
        farmer f1 = new farmer();
        f1.input();
        f1.compute();
        f1.display();
    }

}

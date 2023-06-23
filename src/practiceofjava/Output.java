package practiceofjava;

import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        for(int i =0; i<3;i++) {
            String s1 = sc.nextLine();
            int x = sc1.nextInt();
            System.out.println(s1 +"   "+x);
            }
    }
}

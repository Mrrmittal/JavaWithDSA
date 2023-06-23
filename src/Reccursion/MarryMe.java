package Reccursion;

import java.util.Scanner;

public class MarryMe {
    public static void yes(String response) {
            System.out.println("Thankyou! I love You!");
    }
    public static void no(String response,int index){
        if(index == 10){
            System.out.println("Get Lost! I don't need you.");
                return;
        }

            System.out.println("Will tou marry me : ");
            Scanner sc = new Scanner(System.in);
            String response2 = sc.nextLine();
        if(response2.equals("Yes")){
            System.out.println("Thankyou! I love You!");
            return;
        }

            no(response,index+1);


    }
    public static void main(String[] args) {
        System.out.println("Will tou marry me :");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if(response.equals("Yes")) {
            yes(response);
        }if(response.equals("No")) {
            no(response, 1);
        }

    }
}

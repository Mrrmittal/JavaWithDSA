package Arrays;

import java.util.Scanner;

public class PrintIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 23, 443, 3245, 53, 566, 335, 6677, 44, 5, 6, 67, 7, 8, 78, 87, 54, 728, 798, 25};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        try {
            for (int i = 0; i <= 16; i++) {
                if (numbers[i] == x) {
                    System.out.println("Found! Index number is :" + " " + i);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

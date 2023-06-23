package practiceofjava;

import java.util.Scanner;

public class UpperCase {
    public void capitalized(String line){
        System.out.println(line.toUpperCase());
    }
    public void capitalized2(String line2){
        System.out.println(line2.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        UpperCase myobj = new UpperCase();
        myobj.capitalized(line);
        String line2 = line;
        myobj.capitalized2(line2);
    }
}

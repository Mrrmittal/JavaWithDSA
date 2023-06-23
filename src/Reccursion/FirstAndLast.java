package Reccursion;

import java.util.Scanner;

public class FirstAndLast {
    public static int first =-1;
    public static int last =-1;
    public static void findIndex(String str, char element,int index){
        if(index ==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curChar = str.charAt(index);
        if(curChar == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }

        }
        findIndex(str,element,index+1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string as input : ");
        String str = sc.nextLine();
        findIndex(str,'a',0);
    }
}

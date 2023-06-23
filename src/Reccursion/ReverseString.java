package Reccursion;

public class ReverseString {
    public static void printReverse(String name,int index){

        if(index ==0){
            System.out.println(name.charAt(index));
            return;
        }
        System.out.println(name.charAt(index));
        printReverse(name,index-1);
    }
    public static void main(String[] args) {
        String name = "Jatin";
        int index = name.length()-1;
        printReverse(name,index);

    }
}

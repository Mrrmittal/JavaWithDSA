package flowControl;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Jatin";
        int index = name.length();
        String reverse = "";

        for(int i = index-1;i>=0;i--){
            reverse += name.charAt(i);

        }System.out.println(reverse);

    }
}

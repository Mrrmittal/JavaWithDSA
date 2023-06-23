package practiceofjava;

public class Boolean {
    public static boolean isAdult(int age){
        if(age>18){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean isAdult = isAdult(16);
        if(isAdult){
            System.out.println("Person is adult");
        }
        else{
            System.out.println("Not adult");
        }
    }
}

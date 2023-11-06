package practiceofjava;

public class student {
    int roll_no;
    String name;
    address address;

    public void printDetails(int roll_no, String name){

        System.out.println(roll_no + name );
    }

    public static void main(String[] args) {
        student myObj = new student();
        address myObj2 = new address();
        myObj.printDetails(1, "Jatin");
        myObj2.printAddress("Gali no 4", 119, "Rewari", 123401);
    }
}

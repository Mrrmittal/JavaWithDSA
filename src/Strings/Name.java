package Strings;

public class Name {
    public static void main(String[] args) {
        String firstName = "Jatin";
        String lastName = "Mittal";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(firstName.compareTo(lastName));

        if(firstName.compareTo(lastName)==0){
            System.out.println("Equal Strings");
        }else{
            System.out.println("Unequal Strings");
        }
    }
}

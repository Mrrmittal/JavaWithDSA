package accounts;

public class constructor {
    public int age;
    public String name;

    constructor( String name, int age){
        this.name = name;
        this.age = age;
    }

    public void intro(){
        System.out.println("My name is " +name  + " and My age is " +age );
    }

    public static void main(String[] args) {
        constructor myObj = new constructor("Jatin", 22);
        myObj.intro();
    }
}

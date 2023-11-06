package accounts;

public class encapsulation {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getage(){
        return age;
    }

    public void intro(String name, int age){
        System.out.println("my name is :" +name);
        System.out.println("My age is :" +age);
    }

        public static void main(String[] args) {
        encapsulation myObj = new encapsulation();
        myObj.intro("Jatin Mittal" , 22);

    }
}

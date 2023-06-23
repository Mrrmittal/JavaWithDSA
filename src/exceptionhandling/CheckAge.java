package exceptionhandling;

public class CheckAge {
    public void Age(int age) {
        if (age < 18) {
            System.out.println("Excess Denied!, User is Minor");
        } else {
            System.out.println("Permission Allowed!");
        }
    }
        public static void main (String[] args){
            CheckAge myObj = new CheckAge();
            myObj.Age(16);
        }
    }

package practiceofjava;

public class CheckTernary {
    public void isLesser(int a, int b) {
        String result = (a < b) ? "A is less than B" : " B is less than A";
        System.out.println(result);
    }
    public void checkAge(int age){
        String result2 = (age>=18 && age<=60)? "You are adult": (age>60)? "You are an old man": "You are still teenager";
        System.out.println(result2);

    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int age = 10;
        CheckTernary myobj = new CheckTernary();
        myobj.isLesser(a,b);
        myobj.checkAge(age);
    }
}

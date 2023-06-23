package practiceofjava;

public class ResultBoolean {
    public boolean check(int a, int b){
        if(a ==b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a = 25;
        int b = 30;
        ResultBoolean myobj = new ResultBoolean();
        boolean check = myobj.check(a,b);
        if(check){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}

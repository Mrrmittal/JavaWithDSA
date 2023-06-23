package practiceofjava;

public class ResultInt {
    public int check(int a, int b){
        if(a > b){
            return a-b;
        }
        return b-a;
    }

    public static void main(String[] args) {
        int a =19;
        int b = 22;
        ResultInt myobj = new ResultInt();
        int check = 15 + myobj.check(a,b);
        System.out.println(check);
        }
    }

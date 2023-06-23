package practiceofjava;

public class TableLoop {
    public  void table(int num1,int result){
        for(int i=1; i<=10;i++){
            result = num1*i;
            System.out.println(num1 +"*"+ i +"="+ result);
        }
    }

    public static void main(String[] args) {
        TableLoop myobj = new TableLoop();
        myobj.table(9,0);
    }
}

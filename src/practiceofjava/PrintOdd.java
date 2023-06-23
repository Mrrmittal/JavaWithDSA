package practiceofjava;

public class PrintOdd {
    public static void oddNum(int i){
//        for(int i = 0;i<100;i++){
//            if(i%2 != 0){
//                System.out.println(i);
//            }
//        }
        if(i==100) {
            return;
        }
            if(i%2!=0) {
                System.out.println(i);
            }
        oddNum(i+1);
        }

    public static void main(String[] args) {
        oddNum(1);
    }
}

package practiceofjava;

public class IsPrime {
    public static void main(String[] args) {
        int number = 100;
        int temp =0;
        for(int i =2;i<=number/2;i++){
            if(number%i==0){
                temp++;
            }
        }
        if(temp<=0){
            System.out.println("Yes, Number is Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}

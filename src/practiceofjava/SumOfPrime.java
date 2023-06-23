package practiceofjava;

public class SumOfPrime {
    public static void prime(int num) {
        int sum =0;
        for(int i=2;i<=num;i++){
            int prime =0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    prime++;
                    break;
                }
            }
            if(prime==0){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num =15;
        prime(num);
    }
}

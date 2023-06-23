package practiceofjava;

public class PatternDiagonal {
    public static void main(String[] args) {
        int i;
        int j;
        int n=10;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

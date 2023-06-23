package practiceofjava;

public class SquarePattern {
    public static void main(String[] args) {
        int i;
        int j;
        int n=25;
//       First method we can use
        for(i =1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i>=2 && i<=n-1 && j>=2 && j<=n-1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
//        2nd Method we can use to print Square
        for(i =1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

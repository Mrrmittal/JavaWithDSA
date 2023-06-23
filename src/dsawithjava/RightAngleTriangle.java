package dsawithjava;

public class RightAngleTriangle {
    /* Output should print like
      *
      * *
      * * *
      * * * *
      * * * * *  */
    public static void pattern(int n){
        for(int i =1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /* Output should print like
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5  */
    public static void patternNum(int n){
        for(int i =1;i<=n;i++) {
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        pattern(8);
        patternNum(8);
    }
}

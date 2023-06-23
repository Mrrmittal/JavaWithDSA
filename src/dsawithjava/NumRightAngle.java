package dsawithjava;

public class NumRightAngle {
    /* Output should print like
     1
     2 3
     3 4 5
     6 7 8 9
     10 11 12 13 14  */
    public static void patternNum(int n){
        int count =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    count++;
                    System.out.print(count + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternNum(8);
    }
}

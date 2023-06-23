package dsawithjava;

public class Pattern1 {
    /* Output should print like
      1 2 3 4 ... n
      1 2 3 4 ... n
      1 2 3 4.....n
      1 2 3 4.....n*/
    public void pattern(int n){
        for(int i=1; i<n;i++){
            for(int j=1;j<n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern1 myPattern = new Pattern1();
        myPattern.pattern(5);
    }
}

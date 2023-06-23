package dsawithjava;

public class Pattern2 {
    /* Output should print like
      n . . . . 4 3 2 1
      n . . . . 4 3 2 1
      n . . . . 4 3 2 1
      n . . . . 4 3 2 1*/
    public void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=n;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern2 myPattern = new Pattern2();
        myPattern.pattern(5);
    }
}

package dsawithjava;

public class ReverseNumTriangle {
    /* Output should print like
     1
     2 1
     3 2 1
     4 3 2 1
     5 4 3 2 1  */
    public void reverseTriangle(int n){
        int a = 0;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(i-j+1 + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ReverseNumTriangle myObj = new ReverseNumTriangle();
        myObj.reverseTriangle(5);
    }
}

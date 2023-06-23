package practiceofjava;

public class Triangle {
    public static void reverseTriangle(){
        int i;
        int j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 && i>=i+1 && j<=4 && j>=2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.println("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        reverseTriangle();

    }
}

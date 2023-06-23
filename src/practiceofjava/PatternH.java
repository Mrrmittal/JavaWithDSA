package practiceofjava;

public class PatternH {
            public static void main(String[] args) {
                int i;
                int j;
                int n=15;
                for(i=1;i<=n;i++){
                    for(j=1;j<=n;j++){
                        if(i ==n/2+1 || j==1 || j ==n){
                            System.out.print("* ");
                        }else{
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
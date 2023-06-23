package flowControl;

public class PrintWeird {
    public void weird(int n){

        // if odd then weird
        // else
        if(n%2!=0){
            // w
            System.out.println("Weird");
        }else {
            if(n>=2 && n<=5){
                // not w
                System.out.println("Not weird");
            }else if(n>=6 && n<=20){
                // w
                System.out.println("Weird");
            }else{
                System.out.println("Not weird");
                // not w
            }
        }


//        if(n%2==0 && n<5){
//            System.out.println("Not weird");
//        } else if (n%2==0 && n<20) {
//            System.out.println("Weird");
//        }else if(n%2==0 && n>20){
//            System.out.println("Not Weird");
//        }else{
//            System.out.println("Weird");
//        }

    }

    public static void main(String[] args) {
        PrintWeird myNub = new PrintWeird();
        myNub.weird(24);

    }
}

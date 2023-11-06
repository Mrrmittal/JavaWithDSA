package practiceofjava;

public class address {
    String street;
    int home_num;
    String city;
    int pin;

    public void printAddress(String street,int home_num, String city, int pin){
        System.out.println(" Address : " +street + home_num + city + pin   );
    }

    public static void main(String[] args) {
        address myObj = new address();
    }
}

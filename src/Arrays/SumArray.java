package Arrays;

public class SumArray {
    public static int target = 9
            ;
    public static int firstNumber;
    public static int finalNumber;
    public static int secondNumber;
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            firstNumber = arr[i+1];
            secondNumber = arr[i];
            finalNumber = firstNumber + secondNumber;
            if(finalNumber == target){
                System.out.println("["+arr[i-1]+","+arr[i]+"]");
            }

        }

    }
}

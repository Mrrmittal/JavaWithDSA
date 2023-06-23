package Reccursion;

public class SortedArray {
    public static boolean isSorted(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,7,8,9,10,1};
        System.out.println(isSorted(arr));
    }
}

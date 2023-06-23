package flowControl;

public class SortedArray {

    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 1; j < arr.length; j++)
                if (arr[j] < arr[i])
                    return false;
                    return true;
    }


        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10,89}; //our array
            System.out.println(isSorted(arr));
        }
    }


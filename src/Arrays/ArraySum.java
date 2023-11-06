package Arrays;

public class ArraySum {
    public int add(int num[]){
        int result = 0;
        for(int i=0; i< num.length;i++){
            result += num[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ArraySum myObj = new ArraySum();
        int num[] = {1,2,3,4};
        System.out.println(myObj.add(num));
    }
}

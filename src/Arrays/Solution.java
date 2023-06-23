package Arrays;

public class Solution {
        public void twoSum(int[] nums, int target) {
            int firstNumber;
            int finalNumber;
            int secondNumber;
            boolean flag = true;
            for(int i=1;i<nums.length;i++){
                firstNumber = nums[i-1];
                secondNumber = nums[i];
                finalNumber = firstNumber + secondNumber;

                if(finalNumber == target){
                    System.out.println("["+nums[i-1]+","+nums[i]+"]");
                    flag = false;
                }
            }
            if(flag) System.out.println("Sum not found");
        }

        public static void main(String[] args) {
            int nums[] = {1,2,3,4,5};
            Solution myobj = new Solution();
            myobj.twoSum(nums,19);

        }
    }


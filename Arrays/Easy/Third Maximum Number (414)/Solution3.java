
public class Solution3 {
    public static int thirdMax(int[] nums) {
        long maxValue = Long.MIN_VALUE;
        long secondMaxValue = Long.MIN_VALUE;
        long thirdMaxValue = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == maxValue || nums[i] == secondMaxValue || nums[i] == thirdMaxValue){
                continue;
            } 

            if(nums[i] > maxValue){
                thirdMaxValue = secondMaxValue;
                secondMaxValue = maxValue;
                maxValue = nums[i];
            }else if(nums[i] > secondMaxValue){
                thirdMaxValue = secondMaxValue;
                secondMaxValue = nums[i];
            }else if(nums[i] > thirdMaxValue){
                thirdMaxValue = nums[i];
            }
        }

        if(thirdMaxValue == Long.MIN_VALUE){
            return (int) maxValue;
        }else{
            return (int) thirdMaxValue;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2147483648, 2};
        int thirdMaxV = thirdMax(arr);
        System.out.println(thirdMaxV);
    }
}

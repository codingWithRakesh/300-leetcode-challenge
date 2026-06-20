public class Solution1 {
    public static int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        long secondMax = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < max &&  nums[i] > secondMax){
                secondMax = (long) nums[i];
            }
        }

        long thirdMax = Long.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < secondMax && nums[i] > thirdMax){
                thirdMax = (long) nums[i];
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            return (int) max;
        }else{
            return (int) thirdMax;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, -2147483648, 2};
        int thirdMaxV = thirdMax(arr);
        System.out.println(thirdMaxV);
    }
}

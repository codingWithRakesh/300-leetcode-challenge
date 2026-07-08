
public class Solution1 {
    public static long zeroFilledSubarrayError(int[] nums) {
        long totalSubArray = 0;
        int countZeros = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZeros++;
            }else{
                totalSubArray += (long) (countZeros*(countZeros + 1))/2;
                countZeros = 0;
            }
        }
        totalSubArray += (long) (countZeros*(countZeros + 1))/2;
        return totalSubArray;
    }

    public long zeroFilledSubarray(int[] nums) {
        long totalSubArray = 0;
        int countZeros = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZeros++;
            }else{
                totalSubArray += (long) countZeros * (countZeros + 1) / 2;
                countZeros = 0;
            }
        }
        totalSubArray += (long) countZeros * (countZeros + 1) / 2;
        return totalSubArray;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,0,0,2,0,0,4};
        long totalSubArray = zeroFilledSubarrayError(nums);
        System.out.println(totalSubArray);
    }
}

//link: https://chatgpt.com/c/6a1e3d5b-1710-83ec-b19c-29ad2246e2c1
import java.util.Arrays;

public class Solution2 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int distinct = 1;
        int max = nums[nums.length - 1];

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] != nums[i + 1]){
                distinct++;

                if(distinct == 3){
                    return nums[i];
                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2147483648, 2};
        int thirdMaxV = thirdMax(arr);
        System.out.println(thirdMaxV);
    }
}

import java.util.Arrays;

public class Solution3 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int result = nums.length;
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > mid){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[] nums = {3, 0, 1};
        System.out.println(s.missingNumber(nums));
    }
}

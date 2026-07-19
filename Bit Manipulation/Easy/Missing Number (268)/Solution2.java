
public class Solution2 {
    public int missingNumber(int[] nums) {
        int result = nums.length;

        for(int i = 0; i < nums.length; i++){
            result ^= i;
            result ^= nums[i];
        }

        return result;

    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {3, 0, 1};
        System.out.println(s.missingNumber(nums));
    }
}

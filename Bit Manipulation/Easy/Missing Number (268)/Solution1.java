
public class Solution1 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        return (n * (n + 1) / 2) - sum;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {3, 0, 1};
        System.out.println(s.missingNumber(nums));
    }
}

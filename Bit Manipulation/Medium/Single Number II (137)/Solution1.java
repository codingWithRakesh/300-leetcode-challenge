import java.util.Arrays;

public class Solution1 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i += 3){
            if(nums[i] != nums[i - 1]){
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {2,2,3,2};
        System.out.println(s.singleNumber(nums));
    }
}

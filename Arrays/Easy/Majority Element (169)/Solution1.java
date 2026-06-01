import java.util.Arrays;
public class Solution1 {
    public static int majorityElement(int[] nums) {
        if(nums.length < 0){
            return 0;
        }
        Arrays.sort(nums);
        int midIndex = (0 + nums.length) / 2;
        return nums[midIndex];
    }
    public static void main(String[] args){
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}
import java.util.Arrays;

public class Solution1 {
    public int[] singleNumber(int[] nums) {
        if(nums.length < 3) return nums;
        Arrays.sort(nums);
        int[] arr = new int[2];
        int po = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                if(nums[i] != nums[i + 1]){
                    arr[po++] = nums[i];
                }
            }else if(i == nums.length - 1){
                if(nums[i] != nums[i - 1]){
                    arr[po++] = nums[i];
                }
            }else{
                if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1]){
                    arr[po++] = nums[i];
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {1,2,1,3,2,5};
        int[] ans = s.singleNumber(nums);
        System.out.println(ans[0] + " " + ans[1]);
    }
}

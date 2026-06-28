
public class Solution1 {
    public static boolean increasingTriplet(int[] nums) {
        if(nums == null || nums.length < 3){
            return false;
        }
        int first = nums[0];
        int second = Integer.MAX_VALUE;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < first){
                first = nums[i];
            }else if(nums[i] > first && nums[i] < second){
                second = nums[i];
            }else if(nums[i] > second){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,5,0,4,6};
        boolean isTriplet = increasingTriplet(nums);
        System.out.println(isTriplet);
    }
}

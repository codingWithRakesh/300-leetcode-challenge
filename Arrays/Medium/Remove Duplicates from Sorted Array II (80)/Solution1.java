
public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 2){
            return nums.length;
        }
        int check = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[check - 2]){
                nums[check] = nums[i];
                check++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int count = removeDuplicates(nums);
        System.out.println(count);
        for(int i: nums){
            System.out.println(i);
        }
    }
}

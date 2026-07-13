
public class Solution2 {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n: nums){
            if(i == 0 || i == 1 || nums[i - 2] != n){
                nums[i] = n;
                i++;
            }
        }
        return i;
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

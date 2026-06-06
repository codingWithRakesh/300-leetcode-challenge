public class Solution1 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                consecutive++;
                max = Math.max(max, consecutive);
            }else{
                consecutive = 0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}


public class Solution2 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answear = new int[nums.length];

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] * nums[i];
        }

        int[] suffix = new int[nums.length];
        suffix[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] * nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                answear[i] = suffix[i + 1];
            }else if(i == nums.length - 1){
                answear[nums.length - 1] = prefix[nums.length - 2];
            }else{
                answear[i] = prefix[i - 1] * suffix[i + 1];
            }
        }

        return answear;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        int[] answear = productExceptSelf(arr);
        for(int i: answear){
            System.out.println(i);
        }
    }
}

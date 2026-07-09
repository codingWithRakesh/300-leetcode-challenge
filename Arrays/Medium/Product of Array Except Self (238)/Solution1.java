public class Solution1 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answear = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            answear[i] = product;
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

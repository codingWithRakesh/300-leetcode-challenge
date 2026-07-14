import java.util.ArrayList;

public class Solution1 {
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int st = nums.length - k;
        if(st <= 0){
            return;
        }
        for(int i = st; i < nums.length; i++){
            numbers.add(nums[i]);
        }
        for(int i = 0; i < st; i++){
            numbers.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = numbers.get(i);
        }
        
    }
    public void rotate3(int[] nums, int k) {
        int run = 0;
        while(run < k){
            int lastElement = nums[nums.length - 1];
            for(int i = 0; i < nums.length - 1; i++){
                nums[i+1] = nums[i];
            }
            nums[0] = lastElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        for(int i: arr){
            System.out.println(i);
        }
    }
}

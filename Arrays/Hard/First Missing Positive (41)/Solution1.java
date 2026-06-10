import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static int firstMissingPositive(int[] nums) {
        if(nums.length < 2){
            if(nums[0] <= 0){
                return 1;
            }else{
                int val = nums[0];
                if(val > 1){
                    return 1;
                }else {
                    return ++val;
                }
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            if(nums[i] > 0 && nums[i] < min){
                min = nums[i];
            }
            map.put(nums[i],i);
        }

        if(max < 0){
            return 1;
        }

        for(int i = 1; i <= max; i++){
            if(i < min){
                return i;
            }else if(i > min && i < max){
                if(!map.containsKey(i)){
                    return i;
                }else{
                    continue;
                }
            }
        }
        return max + 1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
        System.out.println(firstMissingPositive(nums));
    }
}

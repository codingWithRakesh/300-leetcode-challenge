import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for(int num: nums){
            if(map.containsKey(num)){
                int data = map.get(num);
                map.put(num, data + 1);
            }else{
                map.put(num, 1);
            }
        }

        int n = nums.length;
        int expectedSum =  n * (n + 1) / 2;
        int sum = 0;

        for(int key: map.keySet()){
            int data = map.get(key);
            if(data > 1){
                ans[0] = key;
            }
            sum += key;
        }

        ans[1] = expectedSum - sum;
        return ans;

    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {1,2,2,4};
        int[] ans = s.findErrorNums(nums);
        System.out.println(ans[0] + " " + ans[1]);
    }
}

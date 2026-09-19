import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int goodPair = 0;
        for(int key: map.keySet()){
            int value = map.get(key);
            if(value < 2) continue;
            goodPair += (value * (value - 1)) / 2;
        }
        return goodPair;
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {1,2,3,1,1,3};
        System.out.println(s.numIdenticalPairs(nums));
    }
}

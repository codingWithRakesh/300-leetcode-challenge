import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(num)){
                int value = map.get(num);
                map.put(num,value + 1);
            }else{
                map.put(num,1);
            }
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
        Solution1 s = new Solution1();
        int[] nums = {1,2,3,1,1,3};
        System.out.println(s.numIdenticalPairs(nums));
    }
}

import java.util.HashSet;
import java.util.Set;

public class Solution4 {
    public int missingNumber(int[] nums) {
        int res=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!s.contains(i)){
                res=i;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        int[] nums = {3, 0, 1};
        System.out.println(s.missingNumber(nums));
    }
}

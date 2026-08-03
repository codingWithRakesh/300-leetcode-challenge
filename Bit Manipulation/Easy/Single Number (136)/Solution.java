
public class Solution {
    public int singleNumber(int[] nums) {
        int and = 0;
        for(int num: nums){
            and = and ^ num;
        }
        return and;
    }
}

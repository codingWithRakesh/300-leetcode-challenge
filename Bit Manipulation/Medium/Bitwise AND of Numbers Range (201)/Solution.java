
public class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while(right > left){
            right = right & (right - 1);
        }
        return right;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int left = 5;
        int right = 7;
        System.out.println(s.rangeBitwiseAnd(left, right));
    }
}

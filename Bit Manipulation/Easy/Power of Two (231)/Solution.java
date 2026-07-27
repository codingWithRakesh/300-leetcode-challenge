
public class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0; i < 32; i++){
            if(n > 0 && 1 << i == n){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 16;
        System.out.println(s.isPowerOfTwo(n));
    }
}

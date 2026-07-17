
public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        int set = 0;
        while(xor != 0){
            xor = xor & (xor - 1);
            set++;
        }
        return set;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int x = 1;
        int y = 4;
        System.out.println(s.hammingDistance(x, y));
    }
}

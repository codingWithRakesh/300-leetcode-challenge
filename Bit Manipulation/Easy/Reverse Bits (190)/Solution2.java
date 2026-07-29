
public class Solution2 {
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder add0 = new StringBuilder();
        String add0s = add0.append("0".repeat(32 - binary.length())).append(binary).toString();
        String reverse = new StringBuilder(add0s).reverse().toString();
        return Integer.parseInt(reverse,2);
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int n = 43261596;
        System.out.println(s.reverseBits(n));
    }
}

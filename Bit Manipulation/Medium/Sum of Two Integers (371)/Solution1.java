
public class Solution1 {
    public int getSum(int a, int b) {
        while(b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int a = 1;
        int b = 2;
        System.out.println(s.getSum(a, b));
    }
}

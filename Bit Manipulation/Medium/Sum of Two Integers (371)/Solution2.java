
public class Solution2 {
    public int getSum(int a, int b) {
        int ans = 0;
        int inc = 0;
        int carry = 0;
        while(inc < 32){
            if(((a >> inc) & 1) == 0 && ((b >> inc) & 1) == 0){
                if(carry != 0){
                    carry = 0;
                    ans |= (1 << inc);
                }
                inc++;
            }else if(((a >> inc) & 1) == 1 && ((b >> inc) & 1) == 0){
                if(carry != 0){
                    carry = 1;
                }else{
                    ans |= (1 << inc);
                    carry = 0;
                }
                inc++;
            }else if(((a >> inc) & 1) == 0 && ((b >> inc) & 1) == 1){
                if(carry != 0){
                    carry = 1;
                }else{
                    ans |= (1 << inc);
                    carry = 0;
                }
                inc++;
            }else{
                if(carry != 0){
                    ans |= (1 << inc);
                }
                carry = 1;
                inc++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int a = 1;
        int b = 2;
        System.out.println(s.getSum(a, b));
    }
}

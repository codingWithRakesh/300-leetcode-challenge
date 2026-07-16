
public class Solution1 {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        if(n == 0){
            return ans;
        }
        for(int i = 1;i <= n; i++){
            ans[i] = numberToBinaryCount(i);
        }
        return ans;
    }
    private int numberToBinaryCount(int n){
        int ans = 0;
        while(n != 0){
            n = n & (n - 1);
            ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int n = 5;
        int[] ans = s.countBits(n);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

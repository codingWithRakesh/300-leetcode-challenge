
public class Solution1 {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'b' || text.charAt(i) == 'a' || text.charAt(i) == 'l' || text.charAt(i) == 'o' || text.charAt(i) == 'n' || text.charAt(i) == 's'){
                arr[text.charAt(i) - 'a']++;
            }
        }
        
        return minNumber(
            arr['b'-'a'],
            arr['a'-'a'],
            arr['l' - 'a'] / 2,
            arr['o' - 'a'] / 2,
            arr['n' - 'a']
        );
    }
    private int minNumber(int a, int b, int c, int d, int e){
        return Math.min(
            Math.min(a,b),
            Math.min(
                Math.min(c,d),
                e
            )
        );
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String text = "loonbalxballpoon";
        System.out.println(s.maxNumberOfBalloons(text));
    }
}

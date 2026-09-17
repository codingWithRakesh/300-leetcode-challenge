
public class Solution2 {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];
        for(int i = 0; i < text.length(); i++){
            arr[text.charAt(i) - 'a']++;
        }
        
        return minNumber(
            arr['b'-'a'],
            arr['a'-'a'],
            arr['l' - 'a'] / 2,
            arr['o' - 'a'] / 2,
            arr['n' - 'a']
        );
    }
    private int minNumber(int... args){
        if(args.length == 0) throw new IllegalArgumentException("minimum one argument is requered");
        int min = args[0];
        for(int a: args){
            if(min > a) min = a;
        }
        return min;
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String text = "loonbalxballpoon";
        System.out.println(s.maxNumberOfBalloons(text));
    }
}

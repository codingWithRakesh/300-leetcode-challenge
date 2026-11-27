
public class Solution1 {
    public int lengthOfLastWord(String s) {
        String[] str = s.trim().split(" ");
        return str[str.length - 1].length();
    }
    public static void main(String[] args){
        String s = "Hello World";
        Solution1 sol = new Solution1();
        System.out.println(sol.lengthOfLastWord(s));
    }
}

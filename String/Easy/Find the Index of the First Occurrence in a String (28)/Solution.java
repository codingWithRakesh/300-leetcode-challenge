
public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        if(!haystack.contains(needle)){
            return -1;
        }

        int j = 0;
        int indexV = 0;
        
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                indexV = i;
                j++;
                if(j == needle.length()){
                    break;
                }
            }else if(j != 0){
                i = i - j;
                j = 0;
            }
        }
        System.out.println(indexV);
        if(j != needle.length()){
            return -1;
        }
        return indexV - (needle.length() - 1);
    }
    public static void main(String[] args){
        String haystack = "hello";
        String needle = "ll";
        Solution sol = new Solution();
        System.out.println(sol.strStr(haystack,needle));
    }
}

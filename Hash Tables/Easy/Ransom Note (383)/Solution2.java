
public class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int mLen = magazine.length();
        int rLen = ransomNote.length();

        if (mLen < rLen) return false;

        int[] freq = new int[26];

        for (char ch : ransomNote.toCharArray()) {
            int i = magazine.indexOf(ch, freq[ch - 'a']);
            if (i == -1) return false;
            freq[ch - 'a'] = i + 1;
        }

        return true;
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(s.canConstruct(ransomNote,magazine));
    }
}

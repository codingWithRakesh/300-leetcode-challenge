
public class Solution1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;
        int[] magazineCount = new int[26];
        int[] ransomNoteCount = new int[26];

        for(char c: magazine.toCharArray()){
            magazineCount[c - 'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            ransomNoteCount[c - 'a']++;
        }
        
        for(int i = 0; i < magazineCount.length; i++){
            if(magazineCount[i] < ransomNoteCount[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(s.canConstruct(ransomNote,magazine));
    }
}

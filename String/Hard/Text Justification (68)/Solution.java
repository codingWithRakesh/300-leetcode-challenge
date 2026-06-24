import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        String[] st = new String[maxWidth];

        int lenCount = 0;
        int wordCount = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() + lenCount <= maxWidth){
                lenCount += words[i].length() + 1;
                st[wordCount] = words[i];
                wordCount++;
            }else{
                StringBuilder stB = new StringBuilder();
                int totalSpace = maxWidth - (lenCount - wordCount);
                int gap = wordCount - 1;
                if(wordCount == 1){
                    stB.append(st[0]).append(" ".repeat(totalSpace));
                }else{
                    int evenSpaces = totalSpace / gap;
                    int extraSpaces = totalSpace % gap;
                    for(int j = 0;j < wordCount; j++){
                        stB.append(st[j]);
                        if(j < gap){
                            stB.append(" ".repeat(evenSpaces));
                            if(extraSpaces-- > 0){
                                stB.append(" ");
                            }
                        }
                    }
                }
                
                ans.add(stB.toString());
                lenCount = 0;
                wordCount = 0;
                st = new String[maxWidth];
                i--;
            }
        }

        int gap = wordCount - 1;
        int totalSpace = maxWidth - (lenCount - wordCount);
        StringBuilder stB = new StringBuilder();
        for(int j = 0; j < wordCount; j++){
            stB.append(st[j]);
            if(j < gap){
                stB.append(" ");
            }
        }
        stB.append(" ".repeat(totalSpace - gap));
        ans.add(stB.toString());

        return ans;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> result = sol.fullJustify(words, maxWidth);
        for (String line : result) {
            System.out.println("\"" + line + "\"");
        }
    }
}

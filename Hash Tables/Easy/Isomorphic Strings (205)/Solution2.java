import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map = new HashMap<>();
        Set<Character>set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char sC = s.charAt(i);
            char tC = t.charAt(i);
            if (set.contains(tC) && !map.containsKey(sC)) {
                return false;
            }
            if(!map.containsKey(sC)){
                map.put(sC,tC);
                set.add(tC);
            }else{
                char value = map.get(sC);
                if(value != tC){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String str1 = "egg";
        String str2 = "add";
        System.out.println(s.isIsomorphic(str1,str2));
    }
}

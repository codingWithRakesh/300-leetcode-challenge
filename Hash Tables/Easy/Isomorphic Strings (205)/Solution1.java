import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if (map.containsValue(t.charAt(i)) && !map.containsKey(s.charAt(i))) {
                return false;
            }
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
            }else{
                char value = map.get(s.charAt(i));
                if(value != t.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String str1 = "egg";
        String str2 = "add";
        System.out.println(s.isIsomorphic(str1,str2));
    }
}

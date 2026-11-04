import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution3 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs){
            String key = key(str);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    String key(String str){
        char[] count = new char[26];
        for(char ch:str.toCharArray()){
            count[ch-'a']++;
        }
        return String.valueOf(count);
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
    }
}

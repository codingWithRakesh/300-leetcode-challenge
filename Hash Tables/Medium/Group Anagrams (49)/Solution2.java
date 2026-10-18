import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String st: strs){
            String key = stringASCISum(st);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(st);
        }

        return new ArrayList<>(map.values());
    }

    private String stringASCISum(String st){
        char[] ch = st.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
    }
}

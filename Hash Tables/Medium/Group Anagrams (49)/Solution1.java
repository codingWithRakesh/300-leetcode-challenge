import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String st: strs){
            String key = stringASCISum(st);
            if(!map.containsKey(key)){
                List<String> arr = new ArrayList<>();
                arr.add(st);
                map.put(key,arr);
            }else{
                List<String> arr = map.get(key);
                arr.add(st);
                map.put(key,arr);
            }
        }

        for(String key: map.keySet()){
            List<String> arr = map.get(key);
            ans.add(new ArrayList<>(arr));
        }

        return ans;

    }

    private String stringASCISum(String st){
        char[] ch = st.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(s.groupAnagrams(strs));
    }
}

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] copy = arr.clone();
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(copy);
        int rank = 1;
        for(int i: copy){
            if(!map.containsKey(i)){
                map.put(i,rank++);
            }
        }

        for(int i = 0; i < arr.length; i++){
            copy[i] = map.get(arr[i]);
        }

        return copy;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {40,10,20,30};
        System.out.println(Arrays.toString(s.arrayRankTransform(arr)));
    }
}

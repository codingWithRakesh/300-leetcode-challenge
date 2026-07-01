import java.util.*;;

public class Solution1 {
    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        List<Integer> majority = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int check = nums.length / 3;

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                map.put(nums[i],value + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        for(int i = 0; i < nums.length; i++){
            int value = map.get(nums[i]);
            if(value > check){
                set.add(nums[i]);
            }
        }

        for(int i : set){
            majority.add(i);
        }

        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        List<Integer> m = majorityElement(nums);
        for(int i: m){
            System.out.println(i);
        }
    }
}

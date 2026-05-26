import java.util.Set;
import java.util.HashSet;

public class Solution1 {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> du = new HashSet<>();
        for(int n: nums){
            du.add(n);
        }
        int i = 0;
        for(Integer d: du){
            nums[i] = d;
            i++;
        }
        return du.size();
    }
    public static void main(String[] args){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

}
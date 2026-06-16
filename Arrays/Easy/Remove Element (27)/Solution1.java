import java.util.ArrayList;

public class Solution1 {
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                numbers.add(nums[i]);
            }
        }
        for(int i = 0; i < numbers.size(); i++){
            nums[i] = numbers.get(i);
        }
        return numbers.size();
    }
    public static void main(String[] args){
        int[] arr = {3,2,2,3};
        System.out.println(removeElement(arr, 3));
    }
}

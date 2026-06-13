import java.util.ArrayList;

public class Solution1 {
    public static void moveZeroes(int[] nums) {
        if(nums.length <= 1){
            return;
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                tmp.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(tmp.size() > i){
                nums[i] = tmp.get(i);
            }else{
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for(int a : arr){
            System.out.println(a);
        }
    }
}

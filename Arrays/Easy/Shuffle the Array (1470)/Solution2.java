
public class Solution2 {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < n; i++){
            arr[2*i] = nums[i];
            arr[2*i + 1] = nums[i + n];
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(arr, n);
        for(int a : res){
            System.out.println(a);
        }
    }    
}

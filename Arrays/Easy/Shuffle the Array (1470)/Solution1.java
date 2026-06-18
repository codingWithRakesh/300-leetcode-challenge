
public class Solution1 {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = n;
        int index = 0;
        while(i < n && j < nums.length){
            arr[index] = nums[i];
            index++;
            i++;
            arr[index] = nums[j];
            index++;
            j++;
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

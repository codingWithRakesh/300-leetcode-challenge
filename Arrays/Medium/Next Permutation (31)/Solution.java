
public class Solution {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public static void nextPermutation(int[] nums) {
        int index = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            reverse(nums, 0);
            return;
        }

        for(int i = nums.length - 1; i > index; i--){
            if(nums[i] > nums[index]){
                swap(nums, index, i);
                break;
            }
        }

        int i = index + 1;
        reverse(nums, i);
    
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
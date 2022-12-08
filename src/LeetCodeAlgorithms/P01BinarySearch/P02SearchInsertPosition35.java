package LeetCodeAlgorithms.P01BinarySearch;

public class P02SearchInsertPosition35 {
    public static void main(String[] args) {

        int result1 = searchInsert(new int[]{-3,-1,3,90}, 0);
        int result2 = searchInsert(new int[] {1,3,5,6}, 2);
        int result3 = searchInsert(new int[] {1,3,5,6}, 7);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(low <= high) {
            mid = (low + high) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if(target > nums[mid]) {
                low = mid + 1;
            } else if(target < nums[mid]) {
                high = mid - 1;
            }
        }
        return low;
    }
}

package LeetCodeAlgorithms.P01BinarySearch;

public class P01BinarySearch704 {
    public static void main(String[] args) {

        int result1 = search(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        int result2 = search(new int[] {-1,0,3,5,9,12}, 2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            }
        }
        return -1;
    }
}

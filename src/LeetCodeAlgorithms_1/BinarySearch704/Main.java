package LeetCodeAlgorithms_1.BinarySearch704;

public class Main {
    public static void main(String[] args) {

        int[] array = {-1,0,3,5,9,12};
        int target = 3;
        int wrongTarget = 4;

        System.out.println(search(array, target));
        System.out.println(search(array, wrongTarget));
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

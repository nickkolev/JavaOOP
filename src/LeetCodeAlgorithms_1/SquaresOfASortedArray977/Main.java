package LeetCodeAlgorithms_1.SquaresOfASortedArray977;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {-4,-1,0,3,10};

        int[] result = sortedSquares(array);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] sortedSquares(int[] nums) {

        // Brute force
        /*a
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
         */

        // Optimized solution - O(n)
        // Input: nums = [-7,-3,2,3,11]
        // the elements with their absolute value -> the element at the start and the last can be the highest value.
        // We can use the Two pointer solution

        int left = 0;
        int right = nums.length -1;
        int index = nums.length- 1;
        int result[] = new int [nums.length];

        while(left <= right) {
            {
                if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                    result[index] = nums[left] * nums[left];
                    left++;
                } else {
                    result[index] = nums[right] * nums[right];
                    right--;
                }
                index--;
            }
        }
        return result;
    }
}

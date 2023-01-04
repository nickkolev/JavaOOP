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
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

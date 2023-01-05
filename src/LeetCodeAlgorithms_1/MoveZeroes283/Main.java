package LeetCodeAlgorithms_1.MoveZeroes283;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};

        moveZeroes(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Find Non Zero element to swap. Keep index of Leftmost Zero.
     *
     * Total number of write operations = Number of Non-Zero elements that need to
     *                                    be moved
     *
     * Time Complexity: O(N)
     *
     * Space Complexity: O(1)
     *
     * N = Length of input array.
     */

    public static void moveZeroes(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array is null");
        }
        if (nums.length <= 1) {
            return;
        }

        // {0,1,0,3,12} -> {1,0,0,3,12} -> {1,3,0,0,12} -> {1,3,12,0,0}
        // {0,0,0,3,12,0} -> {3,0,0,0,12,0} -> {3,12,0,0,0,0}
        int insertPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (insertPos != i) {
                    nums[insertPos] = nums[i];
                    nums[i] = 0;
                }
                insertPos++;
            }
        }
    }

    /*
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int cur = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }
     */
}

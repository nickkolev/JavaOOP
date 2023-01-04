package LeetCodeAlgorithms_1.RotateArray189;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        // result:    [5,6,7,1,2,3,4]
        int k = 3;

        rotatee(array, k);

        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[--r];
            nums[r] = temp;
        }
    }

    public static void rotatee(int[] nums, int k) {
        int n = nums.length;
        k = (n == 0 ? 0 : k % n);
        reverse(nums, 0    , n - k);
        reverse(nums, n - k, n    );
        reverse(nums, 0    , n    );
    }

    public static void rotate(int[] nums, int k) {

        if (k == nums.length) {
            return;
        } else if (k > nums.length) {
            k = k % nums.length;
        }

        //Brute force
        /*
        int last;
        for (int i = 0; i < k; i++) {
            last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
         */

    }
}

package LeetCodeAlgorithms_1.RotateArray189;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        int k = 3;

        rotate(array, k);

        for (int num : array) {
            System.out.println(num);
        }
    }

    public static void rotate(int[] nums, int k) {

        int last;
        for (int i = 0; i < k; i++) {
            last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }

    }
}

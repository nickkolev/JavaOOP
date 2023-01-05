package LeetCodeAlgorithms_1.TwoSumII_InputArrayIsSorted167;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,4};
        int target = 6;

        int[] result = Solution(array, target);
        for (int number : result) {
            System.out.println(number);
        }
    }

    public static int[] Solution(int[] numbers, int target) {
        int middle = numbers.length / 2;
        for(int i = 0; i < numbers.length; i++) {
            if((numbers[i] + numbers[middle]) == target) {
                return new int[]{i, middle};
            } else if ((numbers[i] + numbers[middle]) > target) {
                middle = middle / 2;
                i--;
            } else if((numbers[i] + numbers[middle]) < target) {
                middle = middle + (middle / 2);
            }
        }
        return null;
    }
}

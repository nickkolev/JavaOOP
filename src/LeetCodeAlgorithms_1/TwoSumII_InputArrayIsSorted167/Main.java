package LeetCodeAlgorithms_1.TwoSumII_InputArrayIsSorted167;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,7,8,15};
        int target = 15;

        int[] result = Solution(array, target);
        for (int number : result) {
            System.out.println(number);
        }
    }

    public static int[] Solution(int[] numbers, int target) {
        int leftPoint = 0;
        int rightPoint = numbers.length - 1;

        while (leftPoint != rightPoint) {
            if (numbers[leftPoint] + numbers[rightPoint] == target) {
                return new int[]{leftPoint + 1, rightPoint + 1};
            } else if (numbers[leftPoint] + numbers[rightPoint] > target) {
                rightPoint--;
            } else if (numbers[leftPoint] + numbers[rightPoint] < target) {
                leftPoint++;
            }
        }
        return null;
    }
}

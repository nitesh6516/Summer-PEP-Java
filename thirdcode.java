package Test3;

public class firstcode {
    public static void findMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("Error: Invalid Array");
            return;
        }
        int n = numbers.length;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

    }

    public static void main(String[] args) {
        findMinMax(new int[]{7, 2, 9, 1, 5});
        findMinMax(new int[]{-10, 0, 50, -2});
        findMinMax(new int[]{5, 5, 5, 5});
        findMinMax(null);
    }
}

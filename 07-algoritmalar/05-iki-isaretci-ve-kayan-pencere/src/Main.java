import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sorted = {1, 2, 4, 6, 9, 12};
        int[] pair = twoSumSorted(sorted, 10);
        System.out.println("Toplami 10 olan indeksler: " + Arrays.toString(pair));

        int[] values = {2, 1, 5, 1, 3, 2};
        System.out.println("3 elemanli en buyuk pencere toplami: " + maxWindowSum(values, 3));
    }

    static int[] twoSumSorted(int[] values, int target) {
        requireArray(values);
        int left = 0;
        int right = values.length - 1;
        while (left < right) {
            long sum = (long) values[left] + values[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    static long maxWindowSum(int[] values, int windowSize) {
        requireArray(values);
        if (windowSize <= 0 || windowSize > values.length) {
            throw new IllegalArgumentException("Pencere boyutu dizi sinirlari icinde olmalidir.");
        }

        long current = 0;
        for (int i = 0; i < windowSize; i++) {
            current += values[i];
        }
        long maximum = current;
        for (int right = windowSize; right < values.length; right++) {
            current += values[right] - values[right - windowSize];
            maximum = Math.max(maximum, current);
        }
        return maximum;
    }

    private static void requireArray(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Dizi null olamaz.");
        }
    }
}


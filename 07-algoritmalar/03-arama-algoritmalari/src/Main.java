public class Main {
    public static void main(String[] args) {
        int[] unordered = {8, 3, 11, 2, 7};
        int[] sorted = {2, 3, 7, 8, 11};

        System.out.println("Linear search indeksi: " + linearSearch(unordered, 11));
        System.out.println("Binary search indeksi: " + binarySearch(sorted, 11));
    }

    static int linearSearch(int[] values, int target) {
        requireArray(values);
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] sortedValues, int target) {
        requireArray(sortedValues);
        int left = 0;
        int right = sortedValues.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (sortedValues[middle] == target) {
                return middle;
            }
            if (sortedValues[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    private static void requireArray(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Dizi null olamaz.");
        }
    }
}


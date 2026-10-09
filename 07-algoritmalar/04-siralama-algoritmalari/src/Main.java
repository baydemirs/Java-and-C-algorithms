import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {9, 4, 7, 1, 3};
        int[] second = first.clone();

        insertionSort(first);
        mergeSort(second);

        System.out.println("Insertion sort: " + Arrays.toString(first));
        System.out.println("Merge sort: " + Arrays.toString(second));
    }

    static void insertionSort(int[] values) {
        requireArray(values);
        for (int i = 1; i < values.length; i++) {
            int current = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > current) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = current;
        }
    }

    static void mergeSort(int[] values) {
        requireArray(values);
        int[] buffer = new int[values.length];
        mergeSort(values, buffer, 0, values.length);
    }

    private static void mergeSort(int[] values, int[] buffer, int start, int end) {
        if (end - start <= 1) {
            return;
        }
        int middle = start + (end - start) / 2;
        mergeSort(values, buffer, start, middle);
        mergeSort(values, buffer, middle, end);
        merge(values, buffer, start, middle, end);
    }

    private static void merge(int[] values, int[] buffer, int start, int middle, int end) {
        int left = start;
        int right = middle;
        int index = start;

        while (left < middle && right < end) {
            buffer[index++] = values[left] <= values[right] ? values[left++] : values[right++];
        }
        while (left < middle) {
            buffer[index++] = values[left++];
        }
        while (right < end) {
            buffer[index++] = values[right++];
        }
        System.arraycopy(buffer, start, values, start, end - start);
    }

    private static void requireArray(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Dizi null olamaz.");
        }
    }
}

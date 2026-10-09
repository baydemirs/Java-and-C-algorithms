public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 9, 7};

        System.out.println("O(1) ilk eleman: " + first(numbers));
        System.out.println("O(n) toplam: " + linearSum(numbers));
        System.out.println("O(n^2) tekrar var mi: " + hasDuplicateQuadratic(numbers));
    }

    static int first(int[] values) {
        requireNotEmpty(values);
        return values[0];
    }

    static long linearSum(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Dizi null olamaz.");
        }
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    static boolean hasDuplicateQuadratic(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Dizi null olamaz.");
        }
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] == values[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void requireNotEmpty(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Dizi bos veya null olamaz.");
        }
    }
}


import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] values = {7, 10, 4, 3, 20, 15};
        System.out.println("En buyuk 3. eleman: " + kthLargest(values, 3));
    }

    static int kthLargest(int[] values, int k) {
        if (values == null) {
            throw new IllegalArgumentException("Dizi null olamaz.");
        }
        if (k <= 0 || k > values.length) {
            throw new IllegalArgumentException("k, 1 ile dizi uzunlugu arasinda olmalidir.");
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int value : values) {
            minHeap.offer(value);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.element();
    }
}


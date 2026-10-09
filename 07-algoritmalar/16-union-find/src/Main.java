public class Main {
    public static void main(String[] args) {
        UnionFind sets = new UnionFind(6);
        sets.union(0, 1);
        sets.union(1, 2);
        sets.union(3, 4);

        System.out.println("0 ve 2 bagli mi: " + sets.connected(0, 2));
        System.out.println("0 ve 4 bagli mi: " + sets.connected(0, 4));
        System.out.println("Bilesen sayisi: " + sets.componentCount());
    }

    static final class UnionFind {
        private final int[] parent;
        private final int[] size;
        private int componentCount;

        UnionFind(int elementCount) {
            if (elementCount <= 0) {
                throw new IllegalArgumentException("Eleman sayisi pozitif olmalidir.");
            }
            parent = new int[elementCount];
            size = new int[elementCount];
            componentCount = elementCount;
            for (int i = 0; i < elementCount; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int element) {
            validateElement(element);
            int root = element;
            while (root != parent[root]) {
                root = parent[root];
            }
            while (element != root) {
                int next = parent[element];
                parent[element] = root;
                element = next;
            }
            return root;
        }

        boolean union(int first, int second) {
            int firstRoot = find(first);
            int secondRoot = find(second);
            if (firstRoot == secondRoot) {
                return false;
            }
            if (size[firstRoot] < size[secondRoot]) {
                int temporary = firstRoot;
                firstRoot = secondRoot;
                secondRoot = temporary;
            }
            parent[secondRoot] = firstRoot;
            size[firstRoot] += size[secondRoot];
            componentCount--;
            return true;
        }

        boolean connected(int first, int second) {
            return find(first) == find(second);
        }

        int componentCount() {
            return componentCount;
        }

        private void validateElement(int element) {
            if (element < 0 || element >= parent.length) {
                throw new IllegalArgumentException("Gecersiz eleman: " + element);
            }
        }
    }
}

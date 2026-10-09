import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addUndirectedEdge(0, 1);
        graph.addUndirectedEdge(0, 2);
        graph.addUndirectedEdge(1, 3);
        graph.addUndirectedEdge(2, 4);
        graph.addUndirectedEdge(4, 5);

        System.out.println("BFS: " + graph.bfs(0));
        System.out.println("DFS: " + graph.dfs(0));
    }

    static final class Graph {
        private final List<List<Integer>> adjacency;

        Graph(int vertexCount) {
            if (vertexCount <= 0) {
                throw new IllegalArgumentException("Dugum sayisi pozitif olmalidir.");
            }
            adjacency = new ArrayList<>(vertexCount);
            for (int i = 0; i < vertexCount; i++) {
                adjacency.add(new ArrayList<>());
            }
        }

        void addUndirectedEdge(int first, int second) {
            validateVertex(first);
            validateVertex(second);
            adjacency.get(first).add(second);
            adjacency.get(second).add(first);
        }

        List<Integer> bfs(int start) {
            validateVertex(start);
            List<Integer> order = new ArrayList<>();
            boolean[] visited = new boolean[adjacency.size()];
            Deque<Integer> queue = new ArrayDeque<>();
            visited[start] = true;
            queue.addLast(start);

            while (!queue.isEmpty()) {
                int vertex = queue.removeFirst();
                order.add(vertex);
                for (int neighbor : adjacency.get(vertex)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.addLast(neighbor);
                    }
                }
            }
            return order;
        }

        List<Integer> dfs(int start) {
            validateVertex(start);
            List<Integer> order = new ArrayList<>();
            boolean[] visited = new boolean[adjacency.size()];
            Deque<Integer> stack = new ArrayDeque<>();
            stack.push(start);

            while (!stack.isEmpty()) {
                int vertex = stack.pop();
                if (visited[vertex]) {
                    continue;
                }
                visited[vertex] = true;
                order.add(vertex);
                List<Integer> neighbors = adjacency.get(vertex);
                for (int i = neighbors.size() - 1; i >= 0; i--) {
                    int neighbor = neighbors.get(i);
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
            return order;
        }

        private void validateVertex(int vertex) {
            if (vertex < 0 || vertex >= adjacency.size()) {
                throw new IllegalArgumentException("Gecersiz dugum: " + vertex);
            }
        }
    }
}


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(5);
        graph.addDirectedEdge(0, 1, 4);
        graph.addDirectedEdge(0, 2, 1);
        graph.addDirectedEdge(2, 1, 2);
        graph.addDirectedEdge(1, 3, 1);
        graph.addDirectedEdge(2, 3, 5);
        graph.addDirectedEdge(3, 4, 3);

        System.out.println("0 dugumunden mesafeler: " + Arrays.toString(graph.shortestDistances(0)));
    }

    record Edge(int target, int weight) {
        Edge {
            if (weight < 0) {
                throw new IllegalArgumentException("Dijkstra negatif kenar kabul etmez.");
            }
        }
    }

    record State(int vertex, long distance) implements Comparable<State> {
        @Override
        public int compareTo(State other) {
            return Long.compare(distance, other.distance);
        }
    }

    static final class WeightedGraph {
        private final List<List<Edge>> adjacency;

        WeightedGraph(int vertexCount) {
            if (vertexCount <= 0) {
                throw new IllegalArgumentException("Dugum sayisi pozitif olmalidir.");
            }
            adjacency = new ArrayList<>(vertexCount);
            for (int i = 0; i < vertexCount; i++) {
                adjacency.add(new ArrayList<>());
            }
        }

        void addDirectedEdge(int source, int target, int weight) {
            validateVertex(source);
            validateVertex(target);
            adjacency.get(source).add(new Edge(target, weight));
        }

        long[] shortestDistances(int start) {
            validateVertex(start);
            long[] distances = new long[adjacency.size()];
            Arrays.fill(distances, Long.MAX_VALUE);
            distances[start] = 0;

            PriorityQueue<State> queue = new PriorityQueue<>();
            queue.offer(new State(start, 0));
            while (!queue.isEmpty()) {
                State current = queue.poll();
                if (current.distance() != distances[current.vertex()]) {
                    continue;
                }
                for (Edge edge : adjacency.get(current.vertex())) {
                    long candidate = current.distance() + edge.weight();
                    if (candidate < distances[edge.target()]) {
                        distances[edge.target()] = candidate;
                        queue.offer(new State(edge.target(), candidate));
                    }
                }
            }
            return distances;
        }

        private void validateVertex(int vertex) {
            if (vertex < 0 || vertex >= adjacency.size()) {
                throw new IllegalArgumentException("Gecersiz dugum: " + vertex);
            }
        }
    }
}

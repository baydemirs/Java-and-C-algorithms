import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        for (int value : new int[]{8, 3, 10, 1, 6, 14, 4, 7, 13}) {
            tree.insert(value);
        }

        System.out.println("Inorder: " + tree.inorder());
        System.out.println("7 var mi: " + tree.contains(7));
        System.out.println("Agac yuksekligi: " + tree.height());
    }

    static final class BinarySearchTree {
        private Node root;

        void insert(int value) {
            root = insert(root, value);
        }

        boolean contains(int target) {
            Node current = root;
            while (current != null) {
                if (current.value == target) {
                    return true;
                }
                current = target < current.value ? current.left : current.right;
            }
            return false;
        }

        List<Integer> inorder() {
            List<Integer> result = new ArrayList<>();
            inorder(root, result);
            return result;
        }

        int height() {
            return height(root);
        }

        private Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            if (value < node.value) {
                node.left = insert(node.left, value);
            } else if (value > node.value) {
                node.right = insert(node.right, value);
            }
            return node;
        }

        private void inorder(Node node, List<Integer> result) {
            if (node == null) {
                return;
            }
            inorder(node.left, result);
            result.add(node.value);
            inorder(node.right, result);
        }

        private int height(Node node) {
            if (node == null) {
                return 0;
            }
            return 1 + Math.max(height(node.left), height(node.right));
        }

        private static final class Node {
            private final int value;
            private Node left;
            private Node right;

            private Node(int value) {
                this.value = value;
            }
        }
    }
}


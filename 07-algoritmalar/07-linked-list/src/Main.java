public class Main {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);

        System.out.println("Liste: " + list);
        System.out.println("20 var mi: " + list.contains(20));
        System.out.println("Silinen ilk eleman: " + list.removeFirst());
        System.out.println("Yeni liste: " + list);
    }

    static final class IntLinkedList {
        private Node head;
        private Node tail;
        private int size;

        void addFirst(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = node;
            }
            size++;
        }

        void addLast(int value) {
            Node node = new Node(value);
            if (tail == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        int removeFirst() {
            if (head == null) {
                throw new IllegalStateException("Bos listeden eleman silinemez.");
            }
            int value = head.value;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return value;
        }

        boolean contains(int target) {
            for (Node current = head; current != null; current = current.next) {
                if (current.value == target) {
                    return true;
                }
            }
            return false;
        }

        int size() {
            return size;
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder("[");
            Node current = head;
            while (current != null) {
                result.append(current.value);
                current = current.next;
                if (current != null) {
                    result.append(", ");
                }
            }
            return result.append(']').toString();
        }

        private static final class Node {
            private final int value;
            private Node next;

            private Node(int value) {
                this.value = value;
            }
        }
    }
}


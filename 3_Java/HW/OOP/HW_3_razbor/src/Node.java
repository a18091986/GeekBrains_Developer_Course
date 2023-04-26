public class Node <Integer> {
    int data;
    Node<Integer> next;

    @Override
    public String toString() {
        return String.format("Node %d", data);
    }

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}

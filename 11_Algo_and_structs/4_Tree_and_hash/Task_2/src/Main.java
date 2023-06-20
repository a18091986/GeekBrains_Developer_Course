// Реализуем структуру бинарного дерева
// Реализуем алгоритм поиска элементов по дереву (поиск в глубину).

public class Main <V extends Comparable<V>> {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private Node root;

    private class Node {
        int value;
        private Node left;
        private Node right;
    }

    public boolean find(Node node, int val) {
        if (node.value == val)
            return true;
        else if (val > node.value)
            find(node.right, val);
        else
            find(node.left, val);
        return false;
    }
}
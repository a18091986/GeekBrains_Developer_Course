import java.util.Iterator;


public class List implements Iterable<String> {
    private int size = 0;
    private Node head = null;

    static class Node {
        private String object;
        private Node next;

        public Node(String object, Node node) {
            this.object = object;
            this.next = node;
        }

        public Node() {
            this(null, null);
        }

        public String getElement() {
            return this.object;
        }

        public void setElement(String object) {
            this.object = object;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }

    static class LinkedListIterator implements Iterator<String> {
        private Node currentNode = null;
        private int counter = 0;

        public LinkedListIterator(List linkedList) {
            this.currentNode = linkedList.head;
        }

        public boolean hasNext() {
            return this.currentNode != null;
        }

        public String next() {
            String object = this.currentNode.getElement();
            this.currentNode = this.currentNode.getNext();
            this.counter++;
            return object;
        }

        public int getCounter() {
            return this.counter;
        }

    }

    public Node getHead() {
        return this.head;
    }

    public void addFirst(String object) {
        Node newNode = new Node(object, this.head);
        this.head = newNode;
        this.size++;
    }

    public String getFirst() {
        return this.head.getElement();
    }

    public String removeFirst() {
        String object = this.head.getElement();
        this.head = this.head.getNext();
        return object;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator<String> iterator() {
        return new LinkedListIterator(this);
    }

    public String toString() {
        String output = "";
        Iterator<String> it = this.iterator();
        while (it.hasNext()) {
//            System.out.println(it.hasNext());
            output += it.next() + "\n";
        }
        return output;
    }
}
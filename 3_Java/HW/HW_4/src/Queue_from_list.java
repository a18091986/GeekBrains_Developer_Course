package src;

import java.util.LinkedList;


public class Queue_from_list {
    LinkedList<Integer> ll;

    public Queue_from_list(LinkedList<Integer> ll) {
        this.ll = ll;
    }
    public void print_queue () {
        System.out.println(this.ll);
    }

    public void enqueue (int el) {
       this.ll.addFirst(el);
    }

    public int dequeue () {
        int out = this.ll.getLast();
        this.ll.removeLast();
        return out;
    }

    public int first () {
        return this.ll.getLast();
    }

}

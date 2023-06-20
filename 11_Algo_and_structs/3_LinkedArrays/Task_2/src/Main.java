//5.Расширяем структуру связного списка до двухсвязного.
//6.Обновляем методы согласно новой структуре. Появилась дополнительная переменная, которую необходимо отслеживать во
//всех операциях. Так же благодаря ссылке на последний элемент списка операции работы с концом стали проще
//и их стоит заменить на логику аналогичную работе с
//началом списка
//7.Добавляем метод сортировки для связного списка.


public class Main {
    public static void main(String[] args) {
        TwiceLinkedList tll = new TwiceLinkedList();
        tll.add_first(12);
        tll.add_first(13);
//        tll.addLast(15);
//        tll.addLast(25);
//        tll.addLast(28);
        tll.bubbleSort();
        tll.print_list();
        tll.reverse();
        tll.print_list();

    }

    public static class TwiceLinkedList {
        private Node head;
        private Node tail;
        private class Node {
            private int val;
            private Node next;
            private Node previous;
        }

        public void add_first(int value) {
            Node First = new Node();
            First.val = value;
            if (head != null) {
                head.previous = First;
                First.next = head;
            } else
                tail = First;
            head = First;
        }

        public void del_first () {
            if (head != null && head.next != null) {
                head = head.next;
                head.previous = null;
            }
            else {
                head = null;
                tail = null;
            }
        }

        public boolean find_val (int val) {
            Node current = head;
            while (current != null) {
                if (current.val == val)
                    return true;
                current = current.next;
            }
            return false;
        }

        public void addLast(int value) {
            Node Last = new Node();
            Last.val = value;
            if (tail != null) {
                tail.next = Last;
                Last.previous = tail;
            } else
                head = Last;
            tail = Last;
        }

        public void delLast() {
            if (head != null && head.next != null) {
                tail = tail.previous;
                tail.next = null;
            }
            else {
                head = null;
                tail = null;
            }
        }

        public void bubbleSort () {
            boolean need_sort = true;
            while (need_sort) {
                need_sort = false;
                Node current = head;
                while (current != null && current.next != null) {
                    if (current.val > current.next.val) {
                        int temp = current.val;
                        current.val = current.next.val;
                        current.next.val = temp;
                        need_sort = true;
                    }
                    current = current.next;
                }
            }
        }
        public void print_list() {
            if (head == tail) {
                if (head == null)
                    System.out.println("Empty");
                else
                    System.out.println(head.val);
                return;
            }
            Node current = head;
            while (current.next != null) {
                System.out.println(current.val);
                current = current.next;
            }
            System.out.println(current.val);
        }

        public void reverse() {
            if (head == tail)
                return;
            Node current_left = head;
            Node current_right = tail;
            boolean flag = false;
            while (current_left != current_right) {
                if (current_left.next == current_right)
                    flag = true;
                int temp = current_left.val;
                current_left.val = current_right.val;
                current_right.val = temp;
                current_left = current_left.next;
                current_right = current_right.previous;
                if (flag)
                    break;
            }
        }
    }
}
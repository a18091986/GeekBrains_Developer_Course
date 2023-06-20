//1. Реализуем простой односвязный список.
//2 .Реализуем метод добавления новых элементов в начало списка и удаление
//первого элемента связного списка. Односвязный список всегда имеет ссылку на первый элемент
//последовательности, потому именно с реализации методов для первого
//элемента последовательности стоит начать
//3.Реализуем метод поиска элемента в односвязном списке для проверки наличия
//элемента внутри списка. Для корректной работы со связным список необходимо понимать, как именно
//можно обходить все значения внутри связного списка.
//4. Реализуем метод добавления новых элементов в конец списка и удаление
//последнего элемента связного списка.



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class ex_01_LinkedList {
        private Node head;
        private class Node {
            private int val;
            private Node next;
        }

        public void add_first(int value) {
            Node First = new Node();
            First.val = value;
            if (head != null) {
                First.next = head;
            }
            head = First;
        }

        public void del_first () {
            if (head != null)
                head = head.next;
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
            if (head == null)
                head=Last;
            else {
                Node current = head;
                while (current.next != null)
                    current = current.next;
                current.next = Last;
            }
        }

        public void delLast() {
            if (head != null) {
                Node current = head;
                while (current.next != null) {
                    if (current.next.next == null) {
                        current.next = null;
                        return;
                    }
                    current = current.next;
                }
                head = null;
            }
        }



    }
}
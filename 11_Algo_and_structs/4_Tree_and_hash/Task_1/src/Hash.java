//1. Начинаем реализацию хэш-таблицы с подготовки структуры и необходимых классов.
//2. Давайте напишем реализацию односвязного списка, в котором мы и будем хранить пары ключ-значение.
//3. Добавляем массив связных списков с фиксированным размером (массив бакетов), либо передаваемым в конструкторе.
//4. Также реализуем метод вычисления индекса на основании хэш-кода ключа.
//5. Реализуем метод поиска данных по ключу в хэш-таблице.
//6. Теперь, когда у нас есть базовая структура нашей хэш-таблицы, можно написать алгоритм поиска элементов,
// включающий в себя поиск нужного бакета и поиск по бакету
//7. Необходимо реализовать методы добавления элементов в связный список, если там еще нет пары с
// аналогичным ключом и удаления элемента с аналогичным ключом из списка.
//8.Реализуем алгоритм добавления и удаления элементов из хэш-таблицы по ключу.
//9.Добавляем информацию о размере хэш-таблицы, а также алгоритм увеличения количества бакетов при достижении
// количества элементов до определенного размера относительно количества бакетов (load factor).

import java.util.LinkedList;

class Hash <K, V> {

        private static final double load_factor = 0.75;
        private int size = 0;
        private static final int init_basket_count = 16;
        private Basket[] baskets;

        private void recalc () {
            Basket[] old = baskets;
            baskets = (Basket[]) new Object[old.length * 2];
            for (int i = 0; i < old.length; i++) {
                Basket bask = old[i];
                Basket.Node new_node = bask.head;
                while (new_node != null) {
                    put_out(new_node.value.key, new_node.value.val);
                    new_node = new_node.next;
                }
                old[i] = null;
            }
        }

        public Hash() {
            this(init_basket_count);
        }

        public Hash(int init_size) {
            baskets = (Basket[]) new Object[init_size];
        }

        private int calculate_basket_index(K key) {
            return key.hashCode() % baskets.length;
        }
        private class Entity {
            private K key;
            private V val;
        }

    private class Basket { // односвязный список для хранения пар ключ-значение
        private Node head;

        private class Node {
            private Node next;
            private Entity value;
        }

        public V get_basket(K key) {
            Node current = head;
            while (current != null) {
                if (current.value.key.equals(key))
                    return current.value.val;
                current = current.next;
            }
            return null;
        }

        public boolean put(Entity E) {
            Node node = new Node();
            node.value = E;
            Node current = head;
            if (current != null) {
                while (true) {
                    if (current.value.key.equals(E.key))
                        return false;
                    if (current.next == null) {
                        current.next = node;
                        return true;
                    }
                    current = current.next;
                }
            } else {
                head = node;
                return true;
            }
        }

        public boolean remove(K key) {
            if (head != null) {
                if (head.value.key.equals(key)) {
                    head = head.next;
                    return false;
                } else {
                    Node node = head;
                    while (node.next != null) {
                        if (node.next.value.key.equals(key)) {
                            node.next = node.next.next;
                            return true;
                        }
                        node = node.next;
                    }
                }
            }
            return false;
        }
    }


    public V get_basket_out(K key) {
        int index = calculate_basket_index(key);
        Basket basket = baskets[index];
        if (basket != null)
            return basket.get_basket(key);
        return null;
    }

    public boolean put_out(K key, V value) {
        if (baskets.length * load_factor < size)
            recalc();
        int index = calculate_basket_index(key);
        Basket bask = baskets[index];
        if (bask == null) {
            bask = new Basket();
            baskets[index] = bask;
        }
        Entity E = new Entity();
        E.key = key;
        E.val = value;
        boolean add = bask.put(E);
        if (add)
            size++;
        return add;
    }

    public boolean del_out(K key) {
        int index = calculate_basket_index(key);
        Basket bask = baskets[index];
        boolean del = bask.remove(key);
        if (del)
            size--;
        return del;
    }
}


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr =new int [] {1,2, 3, -100, 10, -40, 4, 20};
        heapsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void heapsort(int [] arr) {
        // построение кучи (перегруппировка массива)
        for (int i = arr.length / 2 - 1; i >= 0; i--)
            heapify(arr, arr.length, i);
        // извлекаем последовательно элементы из кучи
        for (int i = arr.length - 1; i >= 0; i--) {
            // перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // вызываем heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    public static void heapify (int [] arr, int h_size, int r_index) {
        int largest = r_index; // инициализируем набольший элемент как корень
        int l_child = 2 * r_index + 1;
        int r_child = 2 * r_index + 2;

        if (l_child < h_size && arr[l_child] > arr[largest])
            largest = l_child;

        if (r_child < h_size && arr[r_child] > arr[largest])
            largest = r_child;

        if (largest != r_index) {
            int temp = arr[r_index];
            arr[r_index] = arr[largest];
            arr[largest] = temp;
            // рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, h_size, largest);
        }
    }

}
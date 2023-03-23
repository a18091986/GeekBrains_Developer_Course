public class lecture_1_from_arrays {
    public static void main(String[] args) {
        // одномерные массивы
        
        int[] arr = new int[10]; // по умолчанию массив заполняется нулями
        System.out.println(arr.length);
        System.out.println(arr[9]);
        arr[9] = 100;
        System.out.println(arr[9]);
        // System.out.println(arr[20]);

        int[] arr_1 = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr_1.length);
        System.out.println(arr[3]);

        // двумерные массивы

        int[] arr_new[] = new int [3][5];
        for (int [] line : arr_new) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }

        int[] [] arr_new_1 = new int [4][4];
        for (int i = 0; i < arr_new_1.length; i++) {
            for (int j = 0; j < arr_new_1[i].length; j++) {
                System.out.printf("%d ", arr_new_1[i][j]);
            }
            System.out.println();
        }

    }
}

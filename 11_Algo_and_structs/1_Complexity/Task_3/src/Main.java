//1. Необходимо написать алгоритм поиска всех доступных комбинаций
//(посчитать количество) для количества кубиков K с количеством граней N.
//2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
//ограничено (4 кубика, например), либо их количество будет динамическим. Выбор за вами.
//3. Если вы реализуете простой вариант, обращает внимание, что данное решение имеет сложность O(n^4),
//но если количество кубиков сделать переменной, то она трансформируется в O(n^k),
//что будет представлять собой экспоненциальную сложность. Для второго решения очевидно,
//что его сложность O(n^k) с самого начала.


public class Main {
    public static void main(String[] args) {

        System.out.println(combinations(8));
        System.out.println(combinations_dyn_cubes(4, 8));

    }

    public static int combinations(int gran_count) {
        int result = 0;
        for (int i = 0; i < gran_count; i++) {
            for (int j = 0; j < gran_count; j++) {
                for (int k = 0; k < gran_count; k++) {
                    for (int l = 0; l < gran_count; l++) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static int combinations_dyn_cubes(int cubes_count, int gran_count) {
        if (cubes_count > 0) {
            return recursive_counter(1, cubes_count, gran_count);
        } else {
            return 0;
        }
    }

    public static int recursive_counter(int depth, int maxDepth, int gran_count) {
        int result = 0;
        for (int i = 1; i <= gran_count; i++) {
            if (depth==maxDepth)
                result++;
            else
                result += recursive_counter(depth + 1, maxDepth, gran_count);
        }
        return result;
    }
}
import java.util.Scanner;



public class HW_1 {

    static int triangle_number_calculate(int n) {
        if (n == 1) return 1;
        else return triangle_number_calculate(n - 1) + n;
    }

    static int factorial_calculate(int n) {
        if (n == 1) return 1;
        else return factorial_calculate(n - 1) * n;
    }

    static boolean is_simple_check(int n) {
        for (int i = 2; i < ((int) Math.sqrt(n) + 1); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    static double calculate_result(int x, int y, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
        }   
        return result;
    }

    static int[] parse_string_to_nums(String input) {
        
        char[] input_chars = input.toCharArray();
        
        int [] num_arr = new int [input_chars.length];
        int [] numbers_start_arr = new int [3];
        
        int numbers_start_index = 0;
        int num_counter = 0;
        int num_questions = 0;
        boolean digit_flag = false;

        // nums and start_indexes
        for (int i = 0; i < input_chars.length; i++) {
            if (is_symbol_number_check(input_chars[i])) { 
                if (input_chars[i] == '?') {
                    num_arr[num_counter] = -1;
                    num_questions++;
                }
                else num_arr[num_counter] = Character.getNumericValue(input_chars[i]);
                if (!digit_flag)
                    numbers_start_arr[numbers_start_index++] = num_counter;
                num_counter++;
                digit_flag = true;
            }
            else
                digit_flag = false;            
        }

        // questions
        int index = 0;

        int [] result = new int [num_counter + 1 + 3 + 1 + num_questions];

        for (int i = 0; i < num_counter; i++) {
            result[i] = num_arr[i];
            if (result[i] == -1) {
                result[num_counter + 1 + 3 + 1 + index++] = i;
                result[i] = 0;
            }
        }
        result[num_counter] = -999;
        result[num_counter + 4] = -333;

        for (int i = 0; i < 3; i++)
            result[num_counter + 1 + i] = numbers_start_arr[i];
        
        // print_1d_array(result);
        return result;
        
    }

    public static boolean is_symbol_number_check(char c) {
        if (c != ' ' && c != '+' && c != '=')
            return true;
        return false;
    }


    public static void print_1d_array (int [] arr) {
        for (int i : arr)
            System.out.printf("%d", i);
        System.out.println();
    }

    public static int convert_arr_to_int (int [] arr, int start_index, int fin_index) {
        int result=0;
        int index = start_index;
        for (int i = fin_index - start_index; i >=0; i--, index++) {
            result += arr[index]*Math.pow(10, i);
        }
        return result;
    }

    public static void find_right_equation (int [] num_arr, int [] index_arr, int index, 
    int f_num_ind, int s_num_ind, int res_ind, int right) {
        for (int i = num_arr[index_arr[index]]; i < 10; i++) {
            num_arr[index_arr[index]] = i;
           
            int num_1 = convert_arr_to_int(num_arr, f_num_ind, s_num_ind - 1);
            int num_2 = convert_arr_to_int(num_arr, s_num_ind, res_ind - 1);
            int res = convert_arr_to_int(num_arr, res_ind, num_arr.length - 1);

            if (num_1 + num_2 == res) {
                System.out.printf("%d + %d = %d\n", num_1, num_2, res);
                right++;
            }

            int flag = 1;
            for (int j = 0; j < index_arr.length; j++)
                if (num_arr[index_arr[j]] != 9) flag = 0;
            if (flag == 1 && right == 0) System.out.printf("No equation");

            if ((index + 1) <= index_arr.length - 1) {
                num_arr[index_arr[index + 1]] = 1;
                find_right_equation(num_arr, index_arr, index + 1, 
                    f_num_ind, s_num_ind, res_ind, right);
            }
        }
        num_arr[index_arr[index]] = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбери: \n" +
                           "1 - вычислить треугольное число\n" +
                           "2 - вычислить факториал числа\n" + 
                           "3 - вывести все простые числа до заданного\n" + 
                           "4 - калькулятор\n" + 
                           "5 - q + w = e; q,w,e >= 0. Ввести числа q, w. \n  " +
                           "Причем в числе вместо цифр могут быть знаки вопроса. Например: 4? + ?5 = 67\n  " +
                           "Требуется вывести хотя бы одно подходящее выражение или сообщить, что его нет");
        int menu_case = sc.nextInt();
        switch (menu_case) {
            case 1:
                System.out.println("Введи номер треугольного числа: ");
                int num = sc.nextInt();
                System.out.printf("%d-е треугольное число: %d", num, triangle_number_calculate(num));
                break;
            case 2:
                System.out.println("Введи число, факториал которого надо посчитать: ");
                num = sc.nextInt();
                System.out.printf("Факториал %d: %d", num, factorial_calculate(num));
            case 3:
                System.out.println("Введи число вплоть до которого требуется вывести все простые числа: ");
                num = sc.nextInt();
                System.out.printf("%d ", 1);
                for (int i = 2; i <= num; i++) {
                    if (is_simple_check(i)) System.out.printf("%d ", i);
                }
            case 4:
                System.out.println("Введи первое число: ");
                int operator_1 = sc.nextInt();
                sc.nextLine();
                System.out.println("Введи операцию: ");
                String operation = sc.nextLine();
                System.out.println("Введи второе число: ");
                int operator_2 = sc.nextInt();
                System.out.printf("%d %s %d = %f", operator_1, operation, operator_2,
                                  calculate_result(operator_1, operator_2, operation));
                break;
            case 5:
                System.out.println("Введи уравнение: ");
                sc.nextLine();
                String input = sc.nextLine();
                // System.out.printf("Введено уравнение: %s", input);
                int [] num_array = parse_string_to_nums(input);
                int nums = 0;

                for (int i = 0; num_array[i] != -999; i++) {
                    nums += 1;
                }
                
                int [] nums_result = new int[nums];

                for (int i = 0; num_array[i] != -999; i++) {
                    nums_result[i] = num_array[i];
                }

                int [] nums_index_start = new int[3];
                
                for (int i = nums_result.length + 1, j = 0; num_array[i] != -333; i++, j++) {
                    nums_index_start[j] = num_array[i];
                }

                int [] questions_pos = new int[num_array.length - 
                                           nums_result.length - 
                                           nums_index_start.length - 2];

                for (int i = nums_result.length + 5, j = 0; i < num_array.length; i++, j++) {
                    questions_pos[j] = num_array[i];
                }

                find_right_equation(nums_result, questions_pos, 0,    
                nums_index_start[0], nums_index_start[1], nums_index_start[2], 0);
                
            default:
                break;
        }
    }
    
}

package HW.HW_2;
import java.util.List;
import java.util.Scanner;

public class HW_2 {
    public static StringBuilder parse_value_from_key_value(String s) {
        StringBuilder result_value = new StringBuilder("");
        int index_of_value_start = s.indexOf(':');
        char [] arr = s.toCharArray();
        for (int i = index_of_value_start + 1; i < s.length(); i++) {
            result_value.append(arr[i]);
        }
        return result_value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбери: \n" +
                           "1 - Сформировать sql запрос. Дано \"select * from students where\". Требуется сформировать часть WHERE данного запроса, используя StringBuilder\n" + 
                           "Данные для фильтрации содержатся в текстовом файле task_1.txt в виде json-строки. Если значение одного из ключей null, данный ключ не джолжен попасть в запрос" +
                           "2 - вычислить факториал числа\n" + 
                           "3 - вывести все простые числа до заданного\n" + 
                           "4 - калькулятор\n" + 
                           "5 - q + w = e; q,w,e >= 0. Ввести числа q, w. \n  " +
                           "Причем в числе вместо цифр могут быть знаки вопроса. Например: 4? + ?5 = 67\n  " +
                           "Требуется вывести хотя бы одно подходящее выражение или сообщить, что его нет");
        int menu_case = sc.nextInt();
        switch (menu_case) {
            case 1:
                StringBuilder query_start = new StringBuilder("select * from students where ");
                StringBuilder query_finish = new StringBuilder("test");
                String json_key_value = "key:value";
                System.out.println(query_start.append(query_finish));
                System.out.println(parse_value_from_key_value(json_key_value));
                break;
            case 2:
                System.out.println("Введи число, факториал которого надо посчитать: ");
                break;
            case 3:
                System.out.println("Введи число вплоть до которого требуется вывести все простые числа: ");
                break;
            case 4:
                System.out.println("Введи первое число: ");
                break;
        }
    }
}

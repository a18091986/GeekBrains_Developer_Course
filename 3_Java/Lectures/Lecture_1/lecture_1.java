// Шаг 1:
// Java JDK https://www.oracle.com/java/technologies/downloads/
// Шаг 2:
// Extension Pack VS Code
// https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-javapack
// При желаниии:
// https://www.jetbrains.com/ru-ru/idea/
// println(“Hello world”);

//типы данных: примитивы, ссылочные данные (например, массивы)

package Lecture_1;

/**
 * lecture_1
 */

public class lecture_1 {
        public static void main(String[] args) {
            int a = 3; // 4 байта
            short age = 10; 
            float e = 2.7f; // использование f обязательно
            double pi = 3.1415; 
            String s = "new_string";
            String s_null = null;
            System.out.println(s); // сниппет: sysout
            System.out.print(s_null + "\n");
            System.out.println(a);
            System.out.println(age);

            System.out.println("Число e: " + e);
            System.out.println("Число pi: " + pi);
            

            char ch_alpha = '{';
            char ch_num = '1';

            
            System.out.println(ch_alpha);
            System.out.println(ch_num);
            System.out.println(Character.isDigit(ch_alpha));
            System.out.println(Character.isDigit(ch_num));

            boolean is_true = 1 < 2;
            boolean is_true_1 = 2 < 1;
            System.out.println(is_true);
            System.out.println(is_true_1);

            // логические операции: && || ^ (разделяющее или возвращает истину только тогда, когда только одно из значений истинно)
            // побитовые операции: | & 

            System.out.println(true ^ true);

            // строки не так примитивны. 1 символ занимает в памяти 2 байта

            // неявная типизация var 

            var test_int = 123;
            var test_float = 123.123f;
            var test_double = 123.123;
            System.out.println("var test = 123 type is: " + getType(test_int));
            System.out.println("var test = 123.123f type is: " + getType(test_float));
            System.out.println("var test = 123.123 type is: " + getType(test_double));

            // классы - обертки:  служат для подробностей :)
            /* int - Integer, short - Short, long - Long, byte - Byte, float - Float, double - Double, char - Character, boolean - Boolean */

            System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);
            System.out.println("Максимальное значение short: " + Short.MAX_VALUE);

            // обратиться к определенному символу строки

            String s1 = "'test_string'";
            System.out.println("5 символ в строке: " + s1.charAt(5));

            // операции: 1. Присваивание = 2. Арифметические *, /, +, -, %, ++, -- 3. Сравнение < > == != >= <= 4. Логические  || && ^ !
            // побитовые операции: << >> & | ^

            System.out.println(10.2 / 2);
            System.out.println(10.2 % 2);
            System.out.println((int) 10.2 % 2);
            a = 2;
            System.out.println(a);
            System.out.println(a++);
            System.out.println(a);
            System.out.println(++a);

            int d = 123;
            d = d-- - --d;
            System.out.println("c = 123, c-- - --c = " + d);

            // побитовые сдвиги

            int bit = 8; // 1000

            System.out.println(bit << 1); // эквивалентно домножению на 2
            System.out.println(bit >> 1); // эквивалентно делению на 2

            // && проверяет условия до тех пор пока не встретит False - если false проверять дальше бесмысленно
            // & проверяет всё до конца и, соответственно, могут возникнуть ошибки в случаях, когда проверка дальнейших условий имеет смысл только при истинности начальных

            
        }
    

        // любой метод в языке Java должен быть частью класса 
        static String getType(Object o) { // статический член класса 
            return o.getClass().getSimpleName();
        }

        


    }






// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
// Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива
// Метод divisionByZero - Деление на 0
// Метод numberFormatException - Ошибка преобразования строки в число
// Важно: они не должны принимать никаких аргументов

class Answer {
    public static void arrayOutOfBoundsException() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);      
    }

    public static void divisionByZero() {
        int res = 1 / 0;
    }

    public static void numberFormatException() {
        System.out.println(Integer.parseInt("TEST"));
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.arrayOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }

        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
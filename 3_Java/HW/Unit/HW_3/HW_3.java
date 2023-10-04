package HW_3.HW_3;
import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public static class EvenOddTest {

        // Тестируемый метод
        public boolean isEven(int n) {
            return n % 2 == 0;
        }

        // Тестовый случай для четного числа
        @Test
        public void testEvenNumber() {
            assertTrue(isEven(42));
        }

        // Тестовый случай для нечетного числа
        @Test
        public void testOddNumber() {
            assertFalse(isEven(43));
        }

        // Тестовый случай для некорректного входного данных (null)
        @Test(expected = NullPointerException.class)
        public void testNullInput() {
            isEven((Integer) null);
        }

        // Тестовый случай для некорректного входного данных (строка)
        @Test(expected = ClassCastException.class)
        public void testStringInput() {
            isEven((Integer) "Hello");
        }
    }


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean inInterval(int n) {
        // Если число больше 25 и меньше 100, возвращаем true
        if (n > 25 && n < 100) {
            return true;
        }
        // В противном случае возвращаем false
        else {
            return false;
        }
    }

    public class InIntervalTest {

        // Тестируемый метод
        public boolean inInterval(int n) {
            // Если число больше 25 и меньше 100, возвращаем true
            if (n > 25 && n < 100) {
                return true;
            }
            // В противном случае возвращаем false
            else {
                return false;
            }
        }

        // Тестовый случай для числа, которое попадает в интервал (25;100)
        @Test
        public void testNumberInInterval() {
            assertTrue(inInterval(50));
        }

        // Тестовый случай для числа, которое меньше 25
        @Test
        public void testNumberLessThan25() {
            assertFalse(inInterval(10));
        }

        // Тестовый случай для числа, которое больше 100
        @Test
        public void testNumberGreaterThan100() {
            assertFalse(inInterval(150));
        }

        // Тестовый случай для некорректного входного данных (null)
        @Test(expected = NullPointerException.class)
        public void testNullInput() {
            inInterval((Integer) null);
        }

        // Тестовый случай для некорректного входного данных (строка)
        @Test(expected = ClassCastException.class)
        public void testStringInput() {
            inInterval((Integer) "Hello");
        }
    }

}
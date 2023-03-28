import java.io.FileOutputStream;
import java.io.IOException;

public class FourthTask {

    public StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public void writer() throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\fourthTask.txt");

        fos.write(generateString().toString().getBytes());

        fos.close();

    }
}

/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */
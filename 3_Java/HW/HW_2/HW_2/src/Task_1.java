import java.io.*;

public class Task_1 {
    String query = "select * from students where";
    String s_null = "null";

    public String Task_1() throws IOException {
        StringBuilder where_sb = new StringBuilder();
        where_sb = string_from_file();
        where_sb = form_key_value_sb(where_sb);
        return new StringBuilder(query).append(where_sb).toString();
    }

    public StringBuilder form_key_value_sb (StringBuilder s) {
        boolean key_flag = false;
        boolean value_flag = false;

        StringBuilder result_string = new StringBuilder();
        StringBuilder current_key = new StringBuilder();
        StringBuilder current_value = new StringBuilder();

        int quotes_count = 0;

        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) != '"' && (key_flag || value_flag)) {
                if (key_flag)
                    current_key.append(s.charAt(i));
                else if (value_flag)
                    current_value.append(s.charAt(i));
            }
            else if (s.charAt(i) == '"') {

                switch (quotes_count % 4) {
                    case 0 ->
                        key_flag = true;
                    case 1 ->
                            key_flag = false;
                    case 2 ->
                        value_flag = true;
                    case 3 -> {
                        value_flag = false;
                        if (!current_value.toString().equals(s_null)) {
                            result_string.append(current_key)
                                    .append(" = \"")
                                    .append(current_value)
                                    .append("\"")
                                    .append(", ");
                        }
                        current_value=new StringBuilder();
                        current_key = new StringBuilder();
                    }
                }
                quotes_count++;
            }
        }
        return new StringBuilder(result_string.substring(0, result_string.length() - 2)).append(";");
    }


    public StringBuilder string_from_file() throws IOException {
        StringBuilder result = new StringBuilder();
        FileInputStream fis = new FileInputStream("task_1.txt");
        BufferedInputStream bis = new BufferedInputStream(fis, 1000);
        int i;
        while ((i = bis.read()) != -1) {
            result.append((char) i);
        }
        return result;
    }
}

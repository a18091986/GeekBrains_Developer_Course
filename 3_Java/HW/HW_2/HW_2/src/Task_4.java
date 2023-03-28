import java.io.*;

public class Task_4 {
    String [] keys = {"Студент ", " получил ", " по предмету "};
    public void Task_4() throws IOException {
        StringBuilder where_sb = new StringBuilder();
        where_sb = string_from_file();
        parce_json_from_list(where_sb);
    }

    public void parce_json_from_list( StringBuilder s) {
        StringBuilder current = new StringBuilder();
        for (int i = 1; i < s.length() - 1; i++) {
            current.append(s.charAt(i));
            if (s.charAt(i) == '}' && s.charAt(i + 1) == ',') {
                form_out_string(current);
                current = new StringBuilder();
                i++;
            }
        }
        form_out_string(current);
    }

    public void form_out_string (StringBuilder s) {
        boolean key_flag = false;
        boolean value_flag = false;

        StringBuilder result_string = new StringBuilder();
        StringBuilder current_key = new StringBuilder();
        StringBuilder current_value = new StringBuilder();

        int quotes_count = 0;

        for (int i = 1, j = 0; i < s.length() - 1; i++) {
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
                        result_string.append(keys[j])
                                     .append(current_value);
                        j++;
                        current_value = new StringBuilder();
                        current_key = new StringBuilder();
                    }
                }
                quotes_count++;
            }
        }
        System.out.println(result_string.append('.'));
    }


    public StringBuilder string_from_file() throws IOException {
        StringBuilder result = new StringBuilder();
        File fileDir = new File("task_4.txt");

        BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileDir), "UTF-8"));

        String str;

        while ((str = in.readLine()) != null) {
            result.append(str);
        }
        in.close();
        return result;
    }
}


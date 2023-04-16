package src;

import java.util.*;

public class Filter {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> params_list = FillParams.FillParams();
    static HashMap <String, String> input_params_hash = new HashMap<>();
    static HashMap <String, String []> params_arr = FillCatalog.getParams_arr();
    static int counter = 0;
    static int all = 10000;
    public static void menu(Set <Notebook> ntb) {
        boolean end = false;
        while (!end) {
            System.out.println("1 - ищем точное совпадение заданных параметров\n" +
                    "2 - ищем все подходящие ноутбуки, задав минимальные характеристики\n" +
                    "0 - закончить");
            String choice = sc.nextLine();
            switch (choice) {
                case "0" -> {
                    end = true;
                }
                case "1" -> {
                    filter_eq(ntb);
                }
                case "2" -> {
                    filter_range(ntb);
                }
                default -> System.out.println("Некорректный ввод");
            }
        }
    }

    public static void filter_eq(Set <Notebook> notebooks) {
        counter = 0;

        for (String param: params_list) {
            if (param.equals("id")) {
                continue;
            }
            System.out.printf("Введи %s или '-', если параметр не важен:\n" +
                    "Доступные варианты: %s\n", param, Arrays.toString(params_arr.get(param)));
            input_params_hash.put(param, sc.nextLine());
        }
        for (Notebook nt: notebooks) {
            int equal_flag = 1;
            for (String param: input_params_hash.keySet()) {
                if (input_params_hash.get(param).equals("-")) {
                    continue;
                }
                else if ((param.equals("os")) || param.equals("color")) {
                    if (!nt.nout_params().get(param).equals(input_params_hash.get(param)))
                        equal_flag = 0;
                }
                else if (param.equals("ScreenSize")) {
                    if (Double.parseDouble(nt.nout_params().get(param)) !=
                            Double.parseDouble(input_params_hash.get(param)))
                        equal_flag = 0;
                }
                else {
                    if (Integer.parseInt(nt.nout_params().get(param)) !=
                            Integer.parseInt(input_params_hash.get(param)))
                        equal_flag = 0;
                }
            }
            if (equal_flag == 1) {
                System.out.println(nt);
                counter++;
            }
        }
        System.out.printf("Найдено %d из %d ноутбуков\n", counter, all);
    }

    public static void filter_range(Set <Notebook> notebooks) {
        counter = 0;
        for (String param: params_list) {
            if (param.equals("color") || param.equals("os") || param.equals("id")) {
                continue;
            }
            System.out.printf("Введи %s или '-', если параметр не важен:\n" +
                    "Доступные варианты: %s\n", param, Arrays.toString(params_arr.get(param)));
            input_params_hash.put(param, sc.nextLine());
        }
        for (Notebook nt: notebooks) {
            int ok_flag = 1;
            for (String param: input_params_hash.keySet()) {
                if (input_params_hash.get(param).equals("-")) {
                    continue;
                }
                else if (param.equals("ScreenSize")) {
                    if (Double.parseDouble(nt.nout_params().get(param)) <
                            Double.parseDouble(input_params_hash.get(param))) {
                        ok_flag = 0;
                        continue;
                    }
                }
                else {
                    if (Integer.parseInt(nt.nout_params().get(param)) <
                            Integer.parseInt(input_params_hash.get(param))) {
                        ok_flag = 0;
                        continue;
                    }
                }
            }
            if (ok_flag == 1) {
                System.out.println(nt);
                counter++;
            }
        }
        System.out.printf("Найдено %d из %d ноутбуков\n", counter, all);
    }
}

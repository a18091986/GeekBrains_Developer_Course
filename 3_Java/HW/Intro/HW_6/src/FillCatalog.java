package src;
import java.util.*;

import static src.Filter.all;

public class FillCatalog {
    static Random r_1 = new Random();
    static Random r_2 = new Random();
    static String [] ram_arr = {"4", "8", "12", "16", "24", "32"};
    static String [] ssd_arr = {"80", "128", "256", "512", "1024", "2048"};
    static String [] ss_arr = {"10.0", "11.6", "13.0", "14.0", "15.6", "17.0"};
    static String [] os_arr = {"Windows", "Linux", "Dos"};
    static String [] color_arr = {"black", "gray", "white"};
    static int size_1 = 6;
    static int size_2 = 3;

    public static HashMap <String, String []> params_arr = new HashMap<>();
    public static Set<Notebook> main() {

        Set<Notebook> notebookSet = new HashSet<>();
        for (int i = 0; i < all; i++) {
            notebookSet.add(new Notebook(i, Integer.parseInt(ram_arr[r_1.nextInt(size_1)]),
                    Integer.parseInt(ssd_arr[r_1.nextInt(size_1)]), Double.parseDouble(ss_arr[r_1.nextInt(size_1)]),
                    os_arr[r_2.nextInt(size_2)], color_arr[r_2.nextInt(size_2)]));
        }
        System.out.println("Ассортимент: ");
        for (Notebook notebook : notebookSet) {
            System.out.println(notebook);
        }
        return notebookSet;
    }

    public static HashMap<String, String []> getParams_arr() {
        params_arr.put("RAM", ram_arr);
        params_arr.put("SSD", ssd_arr);
        params_arr.put("ScreenSize", ss_arr);
        params_arr.put("os", os_arr);
        params_arr.put("color", color_arr);
        return params_arr;
    }
}



package src;

import java.util.ArrayList;
import java.util.Stack;

public class FillParams {
    public static ArrayList<String> FillParams() {
        ArrayList<String> current_params_list = new ArrayList<>();
        current_params_list.add("id");
        current_params_list.add("RAM");
        current_params_list.add("SSD");
        current_params_list.add("ScreenSize");
        current_params_list.add("os");
        current_params_list.add("color");
        return current_params_list;
    }


}

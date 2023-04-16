package src;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set <Notebook> notebooks = FillCatalog.main();
        Filter.menu(notebooks);
    }
}
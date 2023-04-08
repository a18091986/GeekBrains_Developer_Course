import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    HashMap<String, HashMap<Integer, ArrayList<String>>> phones_book = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    public void insert_into_phones_book() {
        System.out.println("Введи имя для добавления в телефонную книгу: ");
        String name = sc.nextLine();
        System.out.println("Введите номер");
        String phone = sc.nextLine();
        if (phones_book.containsKey(name)) {
            System.out.println("Такое имя уже есть в справочнике - добавляем новый номер или заводим новый контакт?\n" +
                    "1 - новый номер\n" +
                    "2 - новый контакт");
            int answer = sc.nextInt();
            if (answer == 1) {
                System.out.println("Выбери к какому из контактов \"" + name + "\" добавить номер");
                get_from_phones_book_by_name(name);
                phones_book.get(name).get(sc.nextInt()).add(phone);
            }
            else if (answer == 2) {
                ArrayList<String> cur_list = new ArrayList<>();
                cur_list.add(phone);
                phones_book.get(name).put(phones_book.get(name).keySet().size() + 1, cur_list);
            } else {
                System.out.println("Некорректный ввод");
            }
        } else {
            ArrayList<String> cur_list = new ArrayList<>();
            HashMap<Integer, ArrayList<String>> current = new HashMap<>();
            cur_list.add(phone);
            current.put(1, cur_list);
            phones_book.put(name, current);
        }

    }

    public void get_all_from_phones_book() {
        if (phones_book.isEmpty())
            System.out.println("Телефонная книга пуста");
        else
            for (Map.Entry<String, HashMap<Integer, ArrayList<String>>> stringHashMapEntry : phones_book.entrySet())
                System.out.println(stringHashMapEntry);
    }
    public void get_from_phones_book_by_name(String name) {
        if (phones_book.containsKey(name)) {
            HashMap<Integer, ArrayList<String>> current_hash_map = phones_book.get(name);
            for (Map.Entry<Integer, ArrayList<String>> stringHashMapEntry : current_hash_map.entrySet())
                System.out.println(stringHashMapEntry.getKey() + " - " + stringHashMapEntry.getValue().toString());
        }
        else
            System.out.println("Такого имени нет в телефонной книге");
    }

    public void menu() {
        String choice = "";
        while (!choice.equals("0")) {
            System.out.println("""
                    0 - завершить
                    1 - вывести номера по имени
                    2 - распечатать всю телефонную книгу
                    3 - добавить новый номер""");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Введи имя для поиска в телефонной книге: ");
                    String name = sc.nextLine();
                    get_from_phones_book_by_name(name);
                    break;
                case "2":
                    get_all_from_phones_book();
                    break;
                case "3":
                    insert_into_phones_book();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }
        }
        sc.close();
    }
}

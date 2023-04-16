import java.util.*;

public class Task_2 {
    HashMap<String, Integer> hashMap = new HashMap<>();
    ArrayList<String> people = new ArrayList<String>(Arrays.asList(
            "Иван Иванов", "Светлана Петрова", "Кристина Белова",
            "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
            "Иван Мечников", "Петр Петин", "Иван Ежов"));


    public HashMap<String, Integer> fillMap() {
        for (String p : people) {
            String name = p.split(" ")[0];
            if (hashMap.containsKey(name)) {
                int cur_val = hashMap.get(name);
                hashMap.put(name, ++cur_val);
            } else
                hashMap.put(name, 1);
        }
        return hashMap;
    }

    public void print_hash_map() {
        hashMap = fillMap();
        Set<Integer> values_set = new HashSet<>(hashMap.values());
        ArrayList<Integer> values = new ArrayList<>(values_set);
        Collections.sort(values);
        Collections.reverse(values);
        for (int i : values)
            if (i != 1) {
                for (String name : hashMap.keySet()) {
                    if (hashMap.get(name) == i) {
                        System.out.println(name + " " + " " + hashMap.get(name));
                    }
                }
            }
    }
}


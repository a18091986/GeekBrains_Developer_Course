//Создать список по аналогии LinkedList (список связанных элементов), реализовать в нем
//iterable интерфейс. Список должен содержать элементы со ссылкой на следующий элемент.
//Если показалось мало - то реализовать ссылку на предыдущий элемент


import java.util.Collections;
import java.util.List;

public class MainApp {
    public static void main (String[] args) {
        Personal personal = new Personal();
        personal.addUser(new User("Ivan", "Ivanov", 21))
                .addUser(new User("Petr", "Petrov", 25))
                .addUser(new User("Petr", "Ivanov", 25))
                .addUser(new User("User 3", "User 3ln", 15))
                .addUser(new User("Ivan", "Petrov", 12));
        for (User user: personal)
            System.out.println(user);

        Personal personal_subordinates = new Personal();
        personal_subordinates.addUser(new User("User 1", "User 1", 40));

        User user = new User("User 0", "User 0", 25);

        user.setSubordinates(personal);

        personal_subordinates.addUser(user);

        User boss = new User("User Boss", "User Boss", 10);
        boss.setSubordinates(personal_subordinates);

        System.out.println("----------------------------------------------------");

        List<User> users = personal.toList();
        Collections.sort(users);
        System.out.println(users);

        System.out.println("----------------------------------------------------");

        Company company = new Company(boss);

        for (User item: company)
            System.out.println(item);
    }
}

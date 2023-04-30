package personal.views;

import personal.controllers.UserController;
import personal.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;
    private ValidateData validate = new ValidateData();
    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run() {
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());

                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        printAllUsers();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();

                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void deleteUser() {
        printAllUsers();
        String id = prompt("Идентификатор пользователя для удаления: ");
        try {
            userController.deleteUser(userController.readUser(id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private void createUser() {
        userController.saveUser(inputUser());
    }
    private User inputUser(){
        String firstName;
        String lastName;
        do {
            firstName = prompt("Имя: ");
        } while(validate.checkFirstName(firstName));
        do {
            lastName = prompt("Фамилия: ");
        } while( validate.checkLastName(lastName));
        String phone = prompt("Номер телефона: ");
        return  new User(firstName, lastName, phone);
    }
    private String readUser() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private void updateUser() {
        String id = readUser();
        User updatedUser = inputUser();
        updatedUser.setId(id);
        userController.updateUser(updatedUser);
    }

    private void printAllUsers() {
        List<User> users = userController.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}

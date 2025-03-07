package Lesson34_hometask;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            userService.findUser("user123");
        } catch (UserNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}


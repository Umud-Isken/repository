package Lesson34_hometask;

public class UserService {
    public void findUser(String username) throws UserNotFoundException {
        if (!username.equals("admin")) {
            throw new UserNotFoundException("Пользователь " + username + " не найден.");
        }
        System.out.println("Пользователь " + username + " найден.");
    }
}

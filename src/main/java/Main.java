import models.Auto;
import models.User;
import services.UserService;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();
        User user = new User("Misha", 21);
        userService.saveUser(user);
        Auto bmw = new Auto("BMW", "black");
        bmw.setUser(user);
        user.addAuto(bmw);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);
    }
}

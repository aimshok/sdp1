package part2;

import java.util.List;
import java.util.ArrayList;

public class UserViewModel {
    private UserModel userModel;
    private UserView userView;

    public UserViewModel(UserModel model, UserView view) {
        this.userModel = model;
        this.userView = view;
    }

    public void addUser() {
        String name = userView.getUserName();
        userModel.addUser(name);
        userView.showMessage("User added!");
    }

    public void displayUsers() {
        List<String> users = userModel.getUsers();
        userView.displayUsers(users.toArray(new String[0]));
    }

    public void run() {
        while (true) {
            int option = userView.showMenu();
            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    displayUsers();
                    break;
                case 3:
                    userView.showMessage("Exiting...");
                    userView.closeScanner();
                    return;
                default:
                    userView.showMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
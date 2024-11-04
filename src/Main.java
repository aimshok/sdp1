import part2.UserModel;
import part2.UserView;
import part2.UserViewModel;

public class Main {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserViewModel viewModel = new UserViewModel(model, view);

        viewModel.run();
    }
}
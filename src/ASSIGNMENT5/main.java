package ASSIGNMENT5;

public class main {
    public static void main(String[] args) {
        DataModel model = new DataModel();
        ConsoleView view = new ConsoleView();
        DataPresenter presenter = new DataPresenter(model, view);

        presenter.run();
        view.close();
    }
}

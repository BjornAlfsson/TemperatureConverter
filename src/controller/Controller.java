package controller;

import model.Model;
import view.View;

public class Controller {

    private Model model = new Model();
    private View view = new View();

    /**
     * Start the application by showing a window for the user to do something
     */
    public void start() {
        model.model();
    }
}

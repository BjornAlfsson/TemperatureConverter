package view;

import javax.swing.*;

/**
 * This represents the windows for the User. If feeling to replace this with
 * something else, we only need to replace this file and making sure we call the Controller with appropiate data
 */

public class View {

    private JFrame jFrame;
    private JLabel textLabel;
    private JPanel jPanel;

    public View() {
        showWindow();
    }

    public void showWindow() {
        System.out.println("Window");
    }
}

package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This represents the windows for the User. If feeling to replace this with
 * something else, we only need to replace this file and making sure we call the Controller with appropiate data
 */

public class View {

    private JFrame jFrame;
    private JLabel textLabel, response;
    private JPanel jPanel;
    private JButton jButton;
    private JTextField jTextField = new JTextField("1");


    public View() {
        showWindow();
    }

    public void showWindow() {
        jFrame = new JFrame("Temperature Converter");

        Container container = jFrame.getContentPane();

        jFrame.setSize(800, 100);
        textLabel = new JLabel("Enter temperature: ");
        jButton = new JButton("Enter");
        container.add(textLabel);
        container.add(jButton);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void sendTemperature(ActionListener actionListener) {
        jButton.addActionListener(actionListener);
    }

    public Double getTemperature() {
        return Double.parseDouble(jTextField.getText());
    }

    public void showTemperature(Double result) {
        System.out.println("In view " + result);
    }
}

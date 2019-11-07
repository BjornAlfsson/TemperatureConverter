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
    private JLabel textLabel, response, celsiusText, fahrenheitText;
    private JButton jButton;
    private JTextField jTextField;
    private JRadioButton celsius, fahrenheit;
    private Boolean typeOfTemperature;  //false = Fahrenheit, true = Celsius


    public View() {
        showWindow();
    }

    public void showWindow() {
        jFrame = new JFrame("Temperature Converter");
        Container container = jFrame.getContentPane();
        jFrame.setSize(800, 100);

        jButton = new JButton("Enter");
        jButton.setEnabled(false);

        celsiusText = new JLabel("To Celsius");
        celsius = new JRadioButton();
        celsius.setSelected(false);
        celsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeOfTemperature = true;
                jButton.setEnabled(true);
            }
        });

        fahrenheitText = new JLabel("To Fahrenheit");
        fahrenheit = new JRadioButton();
        fahrenheit.setSelected(false);
        fahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeOfTemperature = false;
                jButton.setEnabled(true);
            }
        });

        ButtonGroup bgroup = new ButtonGroup();

        bgroup.add(celsius);
        bgroup.add(fahrenheit);

        jTextField = new JTextField("0.0");
        jTextField.setPreferredSize(new Dimension( 100, 30));

        textLabel = new JLabel("Enter temperature: ");
        response = new JLabel();

        container.setLayout(new FlowLayout());

        container.add(celsiusText);
        container.add(celsius);

        container.add(fahrenheitText);
        container.add(fahrenheit);

        container.add(textLabel);
        container.add(jTextField);
        container.add(jButton);

        container.add(response);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void sendTemperature(ActionListener actionListener) {
        jButton.addActionListener(actionListener);
    }

    public Double getTemperature() {
        if ( jTextField.getText().trim().length() == 0 ) {
            return 0.0;
        }
        return Double.parseDouble(jTextField.getText());
    }

    public void showTemperature(Double result) {
        StringBuilder sb = new StringBuilder();
        sb.append(getTemperature() + " degrees in ");

        sb.append(getTypeOfTemperature() ? "Fahrenheit is " + result.toString() + " in Celsius." : "Celsius is " + result.toString() + " in Fahrenheit.");

        response.setText(sb.toString());
    }

    public Boolean getTypeOfTemperature() {
        return typeOfTemperature;
    }
}

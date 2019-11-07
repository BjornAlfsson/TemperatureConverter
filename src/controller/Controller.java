package controller;

import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private Model model = new Model();
    private View view = new View();

    /**
     * Start the application by showing a window for the user to do something
     */
    public void start() {
        addListener();
    }

    private void addListener() {
       view.sendTemperature(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Double result = 0.0;
               Boolean typeOfTemperature = view.getTypeOfTemperature();

               if ( typeOfTemperature == true ) {
                   result = model.toCelsius(view.getTemperature());
               } else {
                   result = model.toFahrenheit(view.getTemperature());
               }

               view.showTemperature(result);
           }
       });

    }
}

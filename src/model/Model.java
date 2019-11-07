package model;

public class Model {

    public Model() {}

    public Double toCelsius(Double fahrenheit) {
        return Math.round(((fahrenheit- 32) / 1.8000) * 100.0) / 100.0;
    }

    public Double toFahrenheit(Double celsius) {
        return Math.round(((celsius * 1.8) + 32)*100.0)/100.0;
    }
}

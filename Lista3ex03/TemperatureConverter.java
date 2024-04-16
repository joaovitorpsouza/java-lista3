package Lista3ex03;

public class TemperatureConverter {

    private double celsius;
    private double fahrenheit;

    public TemperatureConverter(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    
    public double getCelsiusForFahrenheit(){
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }

    public double getFahrenheitForCelsius(){
        double celsius = (fahrenheit-32)/1.8;
        return celsius;
    }
}
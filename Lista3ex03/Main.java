package Lista3ex03;

public class Main {

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter(10, 50);

        System.out.println("A Temperatura convertida para Fahrenheit será: " + temperatureConverter.getCelsiusForFahrenheit());
        System.out.println("A Temperatura convertida para Celsius será: " + temperatureConverter.getFahrenheitForCelsius());

    }
}
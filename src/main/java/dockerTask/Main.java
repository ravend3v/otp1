package dockerTask;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double fahrenheit = 100;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        celsius = 37;
        fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        System.out.println("Is " + celsius + "°C extreme? " + converter.isExtremeTemperature(celsius));
    }
}
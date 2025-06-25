package org.example;

public class ConvertTo {
    public  static  double  celsiusToFahrenheit(double celsiusTemperature){
        return (celsiusTemperature * 1.8) + 32;
    }
    public  static  double  fahrenheitToCelsius(double fahrenheitTemperature){
        return (fahrenheitTemperature - 32) * 0.55;
    }
}

/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 4/13/2023
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WeatherStation myWeatherstation = new WeatherStation();

        Display[] myDisplay = new Display[]{new CurrentConditions(myWeatherstation),
                new StatisticsDisplay(myWeatherstation),
                new ForecastDisplay(myWeatherstation)};

        for (int i = 0; i< myDisplay.length;i++){
         myWeatherstation.registerDisplay(myDisplay[i]);
        }

        try {
            myWeatherstation.measure();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

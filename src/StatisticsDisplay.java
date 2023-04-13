/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 4/13/2023
 */

public class StatisticsDisplay implements Display {

    private WeatherStation ws;
    private float temperatureMin;
    private float temperatureMax;

    private float temperatureTotal;
    private int numReadings;

    public StatisticsDisplay(WeatherStation ws){
    this.ws = ws;
    temperatureMin = Float.MAX_VALUE;
    temperatureMax = Float.MIN_VALUE;
    temperatureTotal = 0;
    }
    public void update(){
        float tempTemp = ws.getTemperature();
    if (tempTemp >= temperatureMax){
        temperatureMax = tempTemp;
    }
    if (tempTemp <= temperatureMin){
        temperatureMin = tempTemp;
    }
    temperatureTotal+=tempTemp;
    numReadings++;
    display();
    }
    public void display(){
        System.out.println("The maximum temperature is " + temperatureMax);
        System.out.println("The minimum temperature is " + temperatureMin);
        System.out.println("The total temperature is " + temperatureTotal);
        System.out.println("The average temperature is " + temperatureTotal/numReadings);
    }
}

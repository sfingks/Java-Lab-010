/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 4/13/2023
 */

public class CurrentConditions implements Display {
    private WeatherStation ws;
    private float temperature;
    private float humidity;

    public CurrentConditions(WeatherStation ws){
        this.ws = ws;
    }
    public void update(){
        temperature= ws.getTemperature();
        humidity=ws.getHumidity();
        display();

    }
    public void display(){
        System.out.println("The temperature is " + temperature);
        System.out.println("The humidity is " + humidity);
    }
}

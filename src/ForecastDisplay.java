/**
 * @author Trevor Hartman
 * @author MK Ripley
 * @since Version 1.0
 * 4/13/2023
 */

public class ForecastDisplay implements Display {

    private WeatherStation ws;
    private float currentPressure;
    private float lastPressure;

    public ForecastDisplay(WeatherStation ws){
        this.ws = ws;
        lastPressure = 389084;
    }

    public void update(){
    currentPressure = ws.getPressure();
    if (lastPressure == 389084){
        lastPressure = ws.getPressure();
    }
        display();
    }
    public void display(){
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }

    }
}

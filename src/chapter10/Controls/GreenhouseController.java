package chapter10.Controls;

/**
 * 初始化化系统.
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls gc = new GreenhouseControls();
        Event[] eventList = {
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new WaterOn(600),
                gc.new WaterOff(800),
                gc.new LightOn(200),
        };
        gc.addEvent(gc.new Restart(200, eventList));
        gc.addEvent(new GreenhouseControls.Terminate(2000));
        gc.run();
    }
}

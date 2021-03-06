package chapter19;

enum Signal {
    GREEN, YELLOW, RED
}

public class TrafficLight {
    private Signal color = Signal.RED;

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }

    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
            case YELLOW:
                color = Signal.GREEN;
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return "The traffic light is " + color;
    }
}

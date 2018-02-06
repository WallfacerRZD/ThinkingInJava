package chapter10;

public abstract class Event {
    private long enventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        enventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= enventTime;
    }

    public abstract void action();
}

package chapter10.Controls;

/**
 * 抽象事件类
 * 重新action到达实现不同行为的目的
 */
public abstract class Event {
    protected final long delayTime;
    private long enventTime;

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

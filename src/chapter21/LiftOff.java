package chapter21;

public class LiftOff implements Runnable {
    private static int taskCount = 0;
    private final int id = taskCount++;
    protected int countDown = 10;

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + ")";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            // 建议线程调度器切换线程
            Thread.yield();
        }
    }
}

class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}

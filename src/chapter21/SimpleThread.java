package chapter21;

public class SimpleThread extends Thread {
    private int counDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        // 在构造器中调用start(), 可能访问处于不稳定状态的对象
        // 这是优选Executor的另一个原因
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + counDown + ")";
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(this);
            if (--counDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}

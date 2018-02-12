package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        // ExecutorService exec = Executors.newCachedThreadPool();
        // 使用固定线程集, 一次性预先执行代价高昂的线程分配
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        // 防止新任务被提交给ExecutorService
        exec.shutdown();
    }
}

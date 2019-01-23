package chapter5;

import java.util.concurrent.ThreadPoolExecutor;

class T {
    T(int x) {
        System.out.println("T()" + x);
    }
}

/**
 * 输出: T()1
 * T()2
 * t 的初始化在定义t时进行
 * 静态块中并不是初始化, 只是简单的赋值.
 */
public class StaticField {
    static T t = new T(1);

    static {
        t = new T(2);
    }

    public static void main(String[] args) {
        new StaticField();
    }
}

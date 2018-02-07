package chapter14;

import java.util.Random;

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 =
            ClassInitialization.rand.nextInt(1000);

    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2 {
    static int staticNotFinal = 147;

    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3 {
    static int staticNotFinal = 74;

    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws ClassNotFoundException {
        // 使用.class来创建对Class对象的引用不会自动初始化该Class对象
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");

        // 访问编译期常量不会触发初始化
        System.out.println(Initable.staticFinal);
        // 访问非编译期常量会触发初始化
        System.out.println(Initable.staticFinal2);
        System.out.println(Initable2.staticNotFinal);

        // Class.forName()立即初始化
        Class initable3 = Class.forName("chapter14.Initable3");

        System.out.println("After creating Initable3 ref");

        System.out.println(Initable3.staticNotFinal);
    }
}

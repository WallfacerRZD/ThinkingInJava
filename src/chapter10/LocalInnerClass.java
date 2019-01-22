package chapter10;

interface Counter {
    int next();
}

/**
 * 局部内部类可以访问, 代码块中的常量(变量).
 */
public class LocalInnerClass {
    private int count = 0;

    public static void main(String[] args) {
        LocalInnerClass li = new LocalInnerClass();
        Counter c1 = li.getCounter("Local Inner");
        Counter c2 = li.getCounter2("Anonymous Inner");
        for (int i = 0; i < 5; ++i) {
            System.out.println(c1.next());
        }
        for (int i = 0; i < 5; ++i) {
            System.out.println(c2.next());
        }
    }

    Counter getCounter(final String name) {
        int localVar = 0;

        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter");
            }

            @Override
            public int next() {
                System.out.print(localVar);
                System.out.print(name + " ");
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {
            {
                System.out.println("Counter");
            }

            @Override
            public int next() {
                System.out.print(name + " ");
                return count++;
            }
        };
    }
}

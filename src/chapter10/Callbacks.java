package chapter10;

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    static void f(MyIncrement mi) {
        mi.increment();
    }

    public void increment() {
        System.out.println("Other operation");
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    Incrementable getCallbackReference() {
        return new Closure();
    }

    /**
     * MyIncrement.increment()不能用于Incrementable用途
     * 解决方法是用内部类独立地实现Incrementable接口
     */
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbn) {
        callbackReference = cbn;
    }

    void go() {
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);
        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}

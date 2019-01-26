package chapter14;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 17:06
 */
public interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(final String arg) {
        System.out.println("somethingElse " + arg);
    }
}

class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(final Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("Simple Proxy donSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(final String arg) {
        System.out.println("Simple Proxy somethingElse " + arg);
        proxied.somethingElse(arg);
    }
}

class SimpleProxyDemo {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("ddd");
    }

    public static void main(String[] args) {
        SimpleProxyDemo.consumer(new SimpleProxy(new RealObject()));
    }
}

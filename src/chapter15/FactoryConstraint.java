package chapter15;

import sun.security.smartcardio.SunPCSC;

interface FactoryI<T> {
    T create();
}

class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}

class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return 0;
    }
}

class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create() {
            return new Widget();
        }
    }
}

/**
 * 传递显示工厂对象来实例化泛型参数
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        Foo2<Integer> test = new Foo2<>(new IntegerFactory());
        System.out.println("Foo2<Integer> succeeded");
        Foo2<Widget> test2 = new Foo2<>(new Widget.Factory());
        System.out.println("Foo2<Widget> succeeded");
    }
}

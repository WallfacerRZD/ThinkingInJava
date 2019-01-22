package chapter8;

class A {
}

class B extends A {
}

class Super1 {
    A f() {
        System.out.println("Super1.f()");
        return new A();
    }
}

public class Sub1 extends Super1 {
    public static void main(String[] args) {
        Super1 a = new Sub1();
        a.f();
    }

    @Override
    B f() {
        System.out.println("Sub1.f()");
        return new B();
    }
}

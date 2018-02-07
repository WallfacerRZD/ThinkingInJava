package chapter15;

class HasF {
    public void f() {
        System.out.println("HasF.f()");
    }
}

/**
 * 编译失败
 * 为了调用f(), 必须借助泛型类
 */
public class Manipulator<T> /* Manipulator<T extends HasF> */{
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }

    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> mp = new Manipulator<>(hf);
        mp.manipulate();
    }
}

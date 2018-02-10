package chapter15;

class GenericSetter<T> {
    void set(T arg) {
        System.out.println("GenericSetter.set()");
    }
}

class DerivedGS extends GenericSetter<Base> {
    // 重载了
    void set(Derived derived) {
        System.out.println("DerivedGS.set()");
    }
}
public class PlainGenericInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(base);
        dgs.set(derived);
    }
}

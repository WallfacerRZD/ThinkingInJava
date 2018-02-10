package chapter15;

class Base {
}

class Derived extends Base {
}

class OrdinarySetter {
    void set(Base base) {
        System.out.println("OrdinarySetter.set()");
    }
}

class DerivedSetter extends OrdinarySetter {
    void set(Derived derivded) {
        System.out.println("DerivedSetter.set()");
    }
}

public class OrdinaryArguments {
    public static void main(String[] args) {
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter ds = new DerivedSetter();
        // 都是合法的, 因为DerivedSetter.set()重载了OrdinarySetter.set()
        ds.set(derived);
        ds.set(base);
    }
}

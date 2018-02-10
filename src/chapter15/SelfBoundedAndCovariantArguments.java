package chapter15;

interface SelfBoundedSetter<T extends SelfBoundedSetter<T>> {
    void set(T arg);
}

interface Setter extends SelfBoundedSetter<Setter> {
}

public class SelfBoundedAndCovariantArguments {
    void testA(Setter s1, Setter s2, SelfBoundedSetter sbs) {
        s1.set(s2);
        // Error!
        // s1.set(sbs);
    }
}

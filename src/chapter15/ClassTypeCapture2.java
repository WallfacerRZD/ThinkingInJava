package chapter15;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 21:49
 */
class Building {
}

class House extends Building {
}

public class ClassTypeCapture2<T> {
    Class<T> kind;

    public ClassTypeCapture2(final Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static void main(String[] args) {
        ClassTypeCapture2<Building> classTypeCapture1 = new ClassTypeCapture2<>(Building.class);
        System.out.println(classTypeCapture1.f(new Building()));
        System.out.println(classTypeCapture1.f(new House()));

        ClassTypeCapture2<House> classTypeCapture2 = new ClassTypeCapture2<>(House.class);
        System.out.println(classTypeCapture2.f(new Building()));
        System.out.println(classTypeCapture2.f(new House()));
    }
}

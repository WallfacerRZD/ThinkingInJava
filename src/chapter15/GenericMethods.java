package chapter15;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f(1);
        gm.f(1.0);
        gm.f(1L);
        gm.f(1F);
        gm.f('c');
        gm.f(gm);
    }

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }
}

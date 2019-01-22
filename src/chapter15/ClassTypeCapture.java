package chapter15;

public class ClassTypeCapture<T> {
    private Class<T> kind;

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public static void main(String[] args) {
        ClassTypeCapture<String> test = new ClassTypeCapture<>(String.class);
        System.out.println(test.f("test string"));
    }

    public boolean f(Object obj) {
        return kind.isInstance(obj);
    }

}

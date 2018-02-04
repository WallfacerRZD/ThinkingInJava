package chapter7;

class B {
    public static void main(String[] args) {
        System.out.println("class B");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("class Test");
        B.main(args);
    }
}

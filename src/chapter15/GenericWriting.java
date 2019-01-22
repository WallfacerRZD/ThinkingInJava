package chapter15;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting {
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruits = new ArrayList<>();

    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static void f1() {
        writeExact(apples, new Apple());
        // 下面一行也可以编译, 不知道是否是书中的错误?
        writeExact(fruits, new Apple());
    }

    static <T> void
    writeWithWildcard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildcard(apples, new Apple());
        writeWithWildcard(fruits, new Apple());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}

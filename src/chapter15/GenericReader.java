package chapter15;

import java.util.Arrays;
import java.util.List;

public class GenericReader {
    static <T> T readExact(List<T> list) {
        return list.get(0);
    }

    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruits = Arrays.asList(new Fruit());

    static void f1() {
        Apple a = readExact(apples);
        Fruit f = readExact(fruits);
        f = readExact(apples);
    }

    static class Reader<T> {
        T readExact(List<T> list) {
            return list.get(0);
        }
    }

    static void f2() {
        Reader<Fruit> fruitReader = new Reader<>();
        fruitReader.readExact(fruits);
        // Error! List<Fruit> 参数不能接受List<Apple>
        // fruitReader.readExact(apples);
    }

    static class CovarianctReader<T> {
        T readExact(List<? extends T> list) {
            return list.get(0);
        }
    }

    static void f3() {
        CovarianctReader<Fruit> fruitReader = new CovarianctReader<>();
        Fruit f = fruitReader.readExact(fruits);
        Fruit g = fruitReader.readExact(apples);
    }

    public static void main(String[] args) {
        f1();
        f2();
        f3();
    }
}

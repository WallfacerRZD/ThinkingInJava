package chapter15;

public class Holder<T> {
    private T value;

    public Holder() {
    }

    public Holder(T val) {
        value = val;
    }

    public T get() {
        return value;
    }

    public void set(T val) {
        value = val;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<>(new Apple());

        Apple d = apple.get();

        apple.set(d);

        // Cannot upcast
        // Holder<Fruit> fruit = apple;

        Holder<? extends Fruit> fruit = apple;

        // 编译知道get()返回的至少是Fruit
        Fruit p = fruit.get();

        d = (Apple) fruit.get();

        try {
            // 编译时知道fruit.get()至少会返回Fruit, 所以没有报错
            // 运行时fruit.get()返回Apple, 所以运行时出错
            Orange c = (Orange) fruit.get();
        } catch (Exception e) {
            System.out.println(e);
        }
        // set的参数是"? extends Fruit", 编译器无法验证类型的安全性, 所以编译器选择报错
        // fruit.set(new Apple());
        // fruit.set(new Fruit());
        System.out.println(fruit.equals(d));
    }
}

package chapter15;

class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    @Override
    public String toString() {
        return "CountedObject " + id;
    }
}

interface Generator<T> {
    T next();
}

public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> x) {
        type = x;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> x) {
        return new BasicGenerator<>(x);
    }

    public static void main(String[] args) {
        Generator<CountedObject> gm = create(CountedObject.class);
        for (int i = 0; i < 10; ++i) {
            System.out.println(gm.next());
        }
    }
}

package chapter15;
/**
 * @author WallfacerRZD
 * @date 2019/1/30 23:01
 */
class Generic<T> {
}

public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Object[SIZE]; // ClassCastException
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<>();
//        gia[1] = new Object(); // Compile-time error
//        gia[2] = new Generic<Double>(); // Compile-time error
    }
}

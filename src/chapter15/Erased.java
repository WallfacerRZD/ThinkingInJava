package chapter15;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 21:43
 */
public class Erased<T> {
    private final int SIZE = 100;

    public void f(Object arg) {
        // if (arg instanceof T) {} // Error
        // T var = new T(); // Error
        // T[] array1 = new T[SIZE]; // Error
        // T[] array2 = (T[]) new Object[SIZE]; // Unchecked warning
    }
}

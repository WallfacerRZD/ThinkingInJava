package chapter15;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 23:22
 */
public class GenericArray<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArray(int sz) {
        this.array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
        Integer[] integers = gai.rep(); // ClassCastException
        Object[] oa = gai.rep();
    }
}

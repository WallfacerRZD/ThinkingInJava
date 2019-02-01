package chapter15;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 16:08
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(final Class<T> kind) {
        this.kind = kind;
    }

    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind, size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<>(String.class);
        String[] strings = stringArrayMaker.create(10);
        System.out.println(Arrays.toString(strings));
    }
}

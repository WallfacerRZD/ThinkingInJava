package chapter15;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 21:19
 */
public class GenericHolder<T> {
    private T object;

    public void set(T object) {
        this.object = object;
    }

    public T get() {
        return this.object;
    }

    public static void main(String[] args) {
        GenericHolder<String> holder = new GenericHolder<>();
        holder.set("Item");
        String s = holder.get();
    }
}

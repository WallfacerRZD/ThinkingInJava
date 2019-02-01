package chapter15;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 21:14
 */
public class SimpleHolder {
    private Object object;

    public void set(Object object) {
        this.object = object;
    }

    public Object get() {
        return this.object;
    }

    public static void main(String[] args) {
        SimpleHolder holder = new SimpleHolder();
        holder.set("Item");
        String s = (String) holder.get();
    }
}

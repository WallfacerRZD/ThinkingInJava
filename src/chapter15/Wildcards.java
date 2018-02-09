package chapter15;

public class Wildcards {
    static void rawArgs(Holder holder, Object arg) {
        // Warning: Unchecked
        holder.set(arg);
        holder.set(new Wildcards());

        // 编译通过, 但是丢失了信息
        Object obj = holder.get();
    }

    static void unboundedArgs(Holder<?> holder, Object arg) {
        // Error!
        // holder.set(arg);
        // holder.set(new Wildcards());

        // 编译通过, 但是丢失了信息
        Object obj = holder.get();
    }

    static <T> T exact1(Holder<T> holder) {
        T t = holder.get();
        return t;
    }

    static <T> T exact2(Holder<T> holder, T arg) {
        holder.set(arg);
        T t = holder.get();
        return t;
    }

    static <T>
    T wildSubtype(Holder<? extends T> holder, T arg) {
        // Error!
        // holder.set(arg);

        T t = holder.get();
        return t;
    }

    static <T>
    void wildSupertype(Holder<? super T> holder, T arg) {
        holder.set(arg);
        // Error!
        // T t = holder.get();

        // 编译通过, 但丢失了信息
        Object obj = holder.get();
    }

    public static void main(String[] args) {
        Holder raw = new Holder<Long>();

        raw = new Holder();
        Holder<Long> qualified = new Holder<>();
        Holder<?> unbounded = new Holder<Long>();
        Holder<? extends Long> bounded = new Holder<>();
        Long lng = 1L;

        rawArgs(raw, lng);
        rawArgs(qualified, lng);
        rawArgs(unbounded, lng);
        rawArgs(bounded, lng);

        unboundedArgs(raw, lng);
        unboundedArgs(qualified, lng);
        unboundedArgs(unbounded, lng);
        unboundedArgs(bounded, lng);

        // Warning
        Object r1 = exact1(raw);

        Long r2 = exact1(qualified);
        Object r3 = exact1(unbounded);
        Long r4 = exact1(bounded);

        // Warning
        Long r5 = exact2(raw, lng);

        Long r6 = exact2(qualified, lng);

        // Error
        // Long r6 = exact2(unbounded, lng);
        // Long r8 = exact2(bounded, lng);

        // Warning
        Long r9 = wildSubtype(raw, lng);

        Long r10 = wildSubtype(qualified, lng);
        Object r11 = wildSubtype(unbounded, lng);
        Long r12 = wildSubtype(bounded, lng);

        // Warning
        wildSupertype(raw, lng);

        wildSupertype(qualified, lng);

        // Error
        // wildSupertype(bounded, lng);
    }
}

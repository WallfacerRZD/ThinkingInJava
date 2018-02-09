package chapter15;

import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0);

        // 参数为Object, 编译通过
        flist.contains(new Apple());
        flist.indexOf(new Apple());

        // Error!add的参数为"? extends Fruit", 编译器无法确定类型安全, 所以报错
        // flist.add(new Apple());

    }
}

package chapter13;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            v.add(new InfiniteRecursion());
        }

        System.out.println(v);
    }

    @Override
    public String toString() {
        // 拼接字符串时会调用toString()方法, 产生递归调用
        // 正确做法是使用Object.toString()方法.
        return " InfiniteRecursion address: " + this + "\n";
    }
}

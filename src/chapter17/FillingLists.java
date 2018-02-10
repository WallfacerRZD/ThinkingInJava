package chapter17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress {
    private String str;
    StringAddress(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return super.toString() + " " + str;
    }
}

/**
 * 使用单个对像的引用填充
 */
public class FillingLists {
    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(
                Collections.nCopies(4, new StringAddress("hello"))
        );

        System.out.println(list);

        // 只能替换, 不能添加新元素
        Collections.fill(list, new StringAddress("World"));
        System.out.println(list);
    }
}

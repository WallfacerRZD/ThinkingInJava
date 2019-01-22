package chapter15;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    static void assign1(List list) {
        list1 = list;
        list2 = list;
        // Warning: Unchecked conversion
        list3 = list;
    }

    static void assgin2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    static void assgin3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assgin2(new ArrayList());
        // Warning: unchecked conversion
        // 编译器处理<? extends Object>与<?>是不同的
        assgin3(new ArrayList());

        assign1(new ArrayList<String>());
        assgin2(new ArrayList<String>());
        assgin3(new ArrayList<String>());

        List<?> wildList = new ArrayList();
        wildList = new ArrayList<String>();
        assign1(wildList);
        assgin2(wildList);
        assgin3(wildList);
    }
}

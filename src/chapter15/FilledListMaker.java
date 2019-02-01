package chapter15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 21:09
 */
public class FilledListMaker<T> {
    List<T> create(T element, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(element);
        }
        return result;
    }
    public static void main(String[] args) {
        FilledListMaker<String> stringFilledListMaker = new FilledListMaker<>();
        List<String> stringList = stringFilledListMaker.create("hello", 10);
        System.out.println(stringList);
    }
}

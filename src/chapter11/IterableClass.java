package chapter11;

import java.util.Iterator;

/**
 * Iterable接口在foreach循环中使用
 */
public class IterableClass implements Iterable<String> {
    private String[] words = "h e l l o w o r l d".split(" ");
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            int curr = 0;
            @Override
            public boolean hasNext() {
                return curr != words.length;
            }

            @Override
            public String next() {
                return words[curr++];
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s);
        }
    }
}

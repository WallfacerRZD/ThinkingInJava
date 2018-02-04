package chapter7;

import sun.awt.SunHints;

import java.util.Random;

class Value {
    private int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random rand = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    /**
     * 能在编译时确定常数
     */
    private final int valueOne = 0;
    private static final int VALUE_TWO = 99;

    /**
     * public常数
     */
    public static final int VALUE_THREE = 39;

    /**
     * 不能在编译时确定常数
     */
    private final int i4 = rand.nextInt(20);
    static final int INT_5 = rand.nextInt(20);
    private static final Value VAL_3 = new Value(33);

    /**
     * 数组
     */
    private final int[] a = {1, 2, 3};
}

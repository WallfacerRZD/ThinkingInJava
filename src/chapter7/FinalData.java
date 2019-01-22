package chapter7;

import java.util.Random;

class Value {
    private int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    /**
     * public常数
     */
    public static final int VALUE_THREE = 39;
    private static final int VALUE_TWO = 99;
    private static final Value VAL_3 = new Value(33);
    private static Random rand = new Random(47);
    static final int INT_5 = rand.nextInt(20);
    /**
     * 能在编译时确定常数
     */
    private final int valueOne = 0;
    /**
     * 不能在编译时确定常数
     */
    private final int i4 = rand.nextInt(20);
    /**
     * 数组
     */
    private final int[] a = {1, 2, 3};
    private String id;

    public FinalData(String id) {
        this.id = id;
    }
}

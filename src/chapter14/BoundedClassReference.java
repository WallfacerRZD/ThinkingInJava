package chapter14;

public class BoundedClassReference {
    public static void main(String[] args) {
        // Class<Number>并不是Class<Integer>的父类
        Class<? extends Number> bouned = int.class;
        bouned = double.class;
        bouned = Number.class;
        // or anything else derived from Number
    }
}

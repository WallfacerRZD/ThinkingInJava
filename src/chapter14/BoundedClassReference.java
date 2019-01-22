package chapter14;

public class BoundedClassReference {
    public static void main(String[] args) {
        Class<? extends Number> bouned = int.class;
        bouned = double.class;
        bouned = Number.class;
        // or anything else derived from Number
    }
}

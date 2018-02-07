package chapter14;

public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = Integer.class;
        genericIntClass = int.class;

        // 普通Class引用可以执行任何其他Class对象
        intClass = double.class;

        // 泛型Class引用只能指向声明的类型
        // genericIntClass = Double.class;
    }
}

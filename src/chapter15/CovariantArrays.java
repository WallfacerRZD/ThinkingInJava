package chapter15;

import java.util.ArrayList;
import java.util.List;

class Fruit {
}

class Apple extends Fruit {
}

class Jonathan extends Apple {
}

class Orange extends Fruit {
}


public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        // OK
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();

        // 编译通过
        // fruit Runtime type is Apple[], not Fruit[] or Orange[]
        try {
            fruit[0] = new Fruit();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            fruit[0] = new Orange();
        } catch (Exception e) {
            System.out.println(e);
        }
        // List<Fruit> flist = new ArrayList<Apple>(); Compile Error!!
    }
}

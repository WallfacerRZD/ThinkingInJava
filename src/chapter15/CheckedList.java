package chapter15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Pet {
}
class Cat extends Pet {
}

class Dog extends Pet {
}

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dogs1 = new ArrayList<>();
        oldStyleMethod(dogs1);

        List<Dog> dogs2 = Collections.checkedList(new ArrayList<>(), Dog.class);
        try {
            // 抛出异常
            oldStyleMethod(dogs2);
        } catch (Exception e) {
            System.out.println(e);
        }
        // 将导出类型的对象放置到要检查基类的受检查容器中
        List<Pet> pets = Collections.checkedList(new ArrayList<>(), Pet.class);
        pets.add(new Dog());
        pets.add(new Cat());
    }
}

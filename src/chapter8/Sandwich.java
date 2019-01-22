package chapter8;

class Test {
    Test(String s) {
        System.out.println(s);
    }
}

class Meal {
    Test t = new Test("Meal.t");

    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Test t = new Test("Bread.t");

    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Test t = new Test("Cheese.t");

    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Test t = new Test("Lettuce.t");

    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Test t = new Test("Lunch.t");

    Lunch() {
        System.out.println("Lunch()");
    }
}

class Portablelunch extends Lunch {
    Test t = new Test("Portablelunch.t");

    Portablelunch() {
        System.out.println("Portablelunch()");
    }
}

/**
 * 调用子类构造函数发生的事情:
 * 1. 调用父构造函数(各个域先初始化, 然后执行构造函数体)
 * 2. 调用子类的构造函数(各个域先初始化, 然后执行构造函数体)
 * <p>
 * 输出:
 * Meal.t
 * Meal()
 * Lunch.t
 * Lunch()
 * Portablelunch.t
 * Portablelunch()
 * Bread.t
 * Bread()
 * Cheese.t
 * Cheese()
 * Lettuce.t
 * Lettuce()
 * Sandwich()
 */
public class Sandwich extends Portablelunch {
    private Bread d = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    private Sandwich() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }

}

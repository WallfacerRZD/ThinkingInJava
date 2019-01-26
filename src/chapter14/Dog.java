package chapter14;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 17:43
 */

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(final String name) {
        super(name);
    }
}

class Mutt extends Dog {
    public Mutt() {
    }

    public Mutt(final String name) {
        super(name);
    }
}

class Pug extends Dog {
    public Pug() {
    }

    public Pug(final String name) {
        super(name);
    }
}

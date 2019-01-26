package chapter14;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 17:44
 */
public class Cat extends Pet {
    public Cat(final String name) {
        super(name);
    }

    public Cat() {
    }
}

class EgyptianMau extends Cat {
    public EgyptianMau(final String name) {
        super(name);
    }

    public EgyptianMau() {
    }
}

class Manx extends Cat {
    public Manx() {
    }

    public Manx(final String name) {
        super(name);
    }
}

class Cymric extends Manx {
    public Cymric() {
    }

    public Cymric(final String name) {
        super(name);
    }
}

class Rodent extends Pet {
    public Rodent() {
    }

    public Rodent(final String name) {
        super(name);
    }
}

class Rat extends Rodent {
    public Rat() {
    }

    public Rat(final String name) {
        super(name);
    }
}

class Mouse extends Rodent {
    public Mouse() {
    }

    public Mouse(final String name) {
        super(name);
    }
}

class Hamster extends Rodent {
    public Hamster() {
    }

    public Hamster(final String name) {
        super(name);
    }
}
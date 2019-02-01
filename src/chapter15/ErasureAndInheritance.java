package chapter15;

/**
 * @author WallfacerRZD
 * @date 2019/1/30 15:50
 */
class GenericBase<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(final T element) {
        this.element = element;
    }
}

class Derived1<T> extends GenericBase<T> {
}

class Derived2 extends GenericBase {
}

/*
class Derived3 extends GenericBase<?> {

}*/

public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived2 derived2 = new Derived2();
        Object object = derived2.getElement();
        derived2.setElement(object);
    }
}

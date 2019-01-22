package chapter15;

public class ComparablePet implements Comparable<ComparablePet> {

    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

// 无法编译
/*class Hamster extends ComparablePet implements Comparable<Hamster> {

}*/

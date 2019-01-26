package chapter14;

import java.io.PrintStream;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 16:48
 */
interface Null {

}

public class Person {
    public static final Person NULL = new NullPerson();
    public final String first;
    public final String last;
    public final String address;

    public Person(final String first, final String last, final String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class NullPerson extends Person implements Null {
        private NullPerson() {
            super("None", "None", "None");
        }

        @Override
        public String toString() {
            return "NullPerson";
        }
    }
}

class Position {
    private String title;
    private Person person;

    public Position(final String title, final Person person) {
        this.title = title;
        this.person = person;
        if (person == null) {
            this.person = Person.NULL;
        }
    }

    public Position(final String title) {
        this.title = title;
        this.person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(final Person person) {
        this.person = person;
        if (person == null) {
            this.person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", person=" + person +
                '}';
    }
}
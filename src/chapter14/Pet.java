package chapter14;

import java.util.ArrayList;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 17:41
 */
public class Pet {
    public static final PetCreater CREATER =
            new LiteralPetCreator();
    private final String name;

    public Pet(final String name) {
        this.name = name;
    }

    public Pet() {
        this.name = "none";
    }

    public static Pet randomPet() {
        return CREATER.RandomPet();
    }

    public static Pet[] createArray(int size) {
        return CREATER.createArray(size);
    }

    public static ArrayList<Pet> arrayList(int size) {
        return CREATER.arrayList(size);
    }
}



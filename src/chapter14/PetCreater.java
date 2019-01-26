package chapter14;

import java.util.*;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 17:46
 */
public abstract class PetCreater {
    private Random random = new Random(47);

    public abstract List<Class<? extends Pet>> types();

    public Pet RandomPet() {
        int n = random.nextInt(types().size());
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pet[] createArray(int size) {
        Pet[] result = new Pet[size];
        for (int i = 0; i < size; i++) {
            result[i] = RandomPet();
        }
        return result;
    }

    public ArrayList<Pet> arrayList(int size) {
        ArrayList<Pet> result = new ArrayList<>();
        Collections.addAll(result, createArray(size));
        return result;
    }
}

class ForNameCreator extends PetCreater {
    private static List<Class<? extends Pet>> types = new ArrayList<>();

    private static String[] typeNames = {
            "chapter14.Cymric",
            "chapter14.EgyptianMau",
            "chapter14.Manx",
            "chapter14.Mouse",
            "chapter14.Rat",
            "chapter14.Rodent",
            "chapter14.Mutt",
            "chapter14.Pug",
    };

    static {
        loader();
    }

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames) {
                types.add((Class<? extends Pet>) Class.forName(name));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}

class LiteralPetCreator extends PetCreater {

    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    Pet.class, Dog.class, Cat.class, Rodent.class,
                    Mutt.class, Pug.class, EgyptianMau.class, Manx.class,
                    Cymric.class, Rat.class, Mouse.class, Hamster.class
            ));
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class), allTypes.size());

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}

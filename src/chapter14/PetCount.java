package chapter14;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 18:01
 */
public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }

    public static void countPets(PetCreater creater) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creater.createArray(20)) {
            System.out.println(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet) {
                counter.count("Pet");
            }
            if (pet instanceof Dog) {
                counter.count("Dog");
            }
            if (pet instanceof Mutt) {
                counter.count("Mutt");
            }
            if (pet instanceof Cat) {
                counter.count("Cat");
            }
            if (pet instanceof Manx) {
                counter.count("Max");
            }
        }
        System.out.println();
        System.out.println(counter);
    }
    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
}

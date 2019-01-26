package chapter14;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author WallfacerRZD
 * @date 2019/1/26 18:22
 */
public class PetCount3 {
    static class PetCounter extends LinkedHashMap<Class<? extends Pet>, Integer> {
        public void count(Pet pet) {
            for (Map.Entry<Class<? extends Pet>, Integer> pair
                    :
                    entrySet()) {
                if (pair.getKey().isInstance(pet)) {
                    put(pair.getKey(), pair.getValue() + 1);
                }
            }
        }
    }
}

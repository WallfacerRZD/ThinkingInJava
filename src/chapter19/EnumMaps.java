package chapter19;

import java.util.EnumMap;
import java.util.Map;

interface Command {
    void action();
}

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoins, Command> em = new EnumMap<AlarmPoins, Command>(AlarmPoins.class);
        em.put(AlarmPoins.KITCHEN, new Command() {
            @Override
            public void action() {
                System.out.println("Kitchen fired");
            }
        });
        em.put(AlarmPoins.BATHROOM, new Command() {
            @Override
            public void action() {
                System.out.println("Bathroom fire!");
            }
        });

        for (Map.Entry<AlarmPoins, Command> e : em.entrySet()) {
            System.out.println(e.getKey() + ": ");
            e.getValue().action();
        }

        try {
            em.get(AlarmPoins.UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

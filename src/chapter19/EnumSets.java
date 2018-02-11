package chapter19;

import java.util.EnumSet;

enum AlarmPoins {
    STAIR1, STAIR2, LOBBY,
    OFFICE1, OFFICE2, OFFICE3, OFFICE4,
    BATHROOM, UTILITY, KITCHEN
}

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoins> points = EnumSet.noneOf(AlarmPoins.class);
        points.add(AlarmPoins.BATHROOM);
        System.out.println(points);

        points.addAll(EnumSet.of(AlarmPoins.STAIR1, AlarmPoins.STAIR2, AlarmPoins.KITCHEN));
        System.out.println(points);

        points = EnumSet.allOf(AlarmPoins.class);
        System.out.println(points);

        points.removeAll(EnumSet.range(AlarmPoins.OFFICE1, AlarmPoins.OFFICE4));
        System.out.println(points);

        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}

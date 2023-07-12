package global.resources;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.stream.Collectors;

public enum TakeResources implements Resources{
    WATER(1),
    RABIT(5),
    PIG(10),
    COW(20);


    private final int takeHp;

    private static final EnumMap<TakeResources, Integer> resources = new EnumMap<>(TakeResources.class);

    static {
        Arrays.stream(TakeResources.values())
                .collect(Collectors
                        .toMap(takeResources -> takeResources, takeResources -> takeResources.takeHp
                        ));
    }

    TakeResources(int takeHp) {
        this.takeHp = takeHp;
    }

    @Override
    public int takeHp() {
        return takeHp;
    }
}

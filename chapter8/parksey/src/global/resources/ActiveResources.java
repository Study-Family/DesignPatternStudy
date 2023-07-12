package global.resources;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.stream.Collectors;

public enum ActiveResources implements Resources{
    TREE(-3),
    ROCK(-10),
    ICON(-20);


    private final int takeHp;

    private static final EnumMap<ActiveResources, Integer> resources = new EnumMap<>(ActiveResources.class);

    static {
        Arrays.stream(ActiveResources.values())
                .collect(Collectors
                        .toMap(activeResources -> activeResources, activeResources -> activeResources.takeHp
                        ));
    }


    ActiveResources(int takeHp) {
        this.takeHp = takeHp;
    }

    @Override
    public int takeHp() {
        return takeHp;
    }
}

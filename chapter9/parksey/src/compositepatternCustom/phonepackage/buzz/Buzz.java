package compositepatternCustom.phonepackage.buzz;

import compositepatternCustom.Component;

import java.util.ArrayList;
import java.util.List;

public class Buzz implements Component{
    private List<Component> components = new ArrayList<>();

    public Buzz() {
        components.add(new Cradle());
        components.add(new Earbud());
    }


    @Override
    public void printInfo() {
        components.stream().forEach(Component::printInfo);
    }

    @Override
    public int getPrice() {
        return components.stream()
                .mapToInt(Component::getPrice)
                .sum();
    }
}

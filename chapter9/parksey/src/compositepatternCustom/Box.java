package compositepatternCustom;

import compositepatternCustom.electric.Monitor;
import compositepatternCustom.phonepackage.PhonePackage;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private List<Component> components = new ArrayList<>();
    private Recipe recipe;

    public Box() {
        components.add(new PhonePackage());
        components.add(new Monitor());
        recipe = new Recipe();
    }


    @Override
    public void printInfo() {
        components.stream().forEach(Component::printInfo);
    }

    @Override
    public int getPrice() {
        initrecipe();
        return recipe.getPrice();
    }

    public void initrecipe() {
        this.recipe.initrecipe(components.stream()
                .mapToInt(Component::getPrice)
                .sum());
    }
}

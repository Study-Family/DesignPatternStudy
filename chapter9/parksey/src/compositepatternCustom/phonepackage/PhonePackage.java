package compositepatternCustom.phonepackage;

import compositepatternCustom.Component;
import compositepatternCustom.phonepackage.buzz.Buzz;
import compositepatternCustom.phonepackage.charger.SamsungCharger;
import compositepatternCustom.phonepackage.phone.SamsungPhone;

import java.util.ArrayList;
import java.util.List;

public class PhonePackage implements Component {
    private List<Component> components = new ArrayList<>();

    public PhonePackage() {
        components.add(new Buzz());
        components.add(new SamsungCharger());
        components.add(new SamsungPhone());
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

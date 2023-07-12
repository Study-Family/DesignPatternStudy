package compositepatternCustom.electric;

import compositepatternCustom.Component;

public class Monitor implements Component {

    @Override
    public void printInfo() {
        System.out.println("모니터");
    }

    @Override
    public int getPrice() {
        return 200000;
    }
}

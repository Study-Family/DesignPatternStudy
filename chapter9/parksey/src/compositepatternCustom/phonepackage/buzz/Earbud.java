package compositepatternCustom.phonepackage.buzz;

import compositepatternCustom.Component;

public class Earbud implements Component {
    @Override
    public void printInfo() {
        System.out.println("버즈 이어버드");
    }

    @Override
    public int getPrice() {return 10000;}
}

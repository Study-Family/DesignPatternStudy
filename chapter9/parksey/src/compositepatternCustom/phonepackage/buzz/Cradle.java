package compositepatternCustom.phonepackage.buzz;

import compositepatternCustom.Component;

public class Cradle implements Component {
    @Override
    public void printInfo() {System.out.println("버즈 크래들");}

    @Override
    public int getPrice() {return 20000;}
}

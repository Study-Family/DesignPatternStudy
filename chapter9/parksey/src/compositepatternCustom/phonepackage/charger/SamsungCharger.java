package compositepatternCustom.phonepackage.charger;

import compositepatternCustom.Component;

public class SamsungCharger implements Component {

    @Override
    public void printInfo() {System.out.println("샘송 충전기");}

    @Override
    public int getPrice() {return 5000;}
}

package compositepatternCustom.phonepackage.phone;

import compositepatternCustom.Component;

public class SamsungPhone implements Component {
    public void printInfo() {System.out.println("샘송 갤럭쉬 21");}

    public int getPrice() {return 100000;}
}

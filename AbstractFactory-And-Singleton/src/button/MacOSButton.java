package button;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("[맥 마우스] 생성됨");
    }
}

package observer;

public class ObserverConcrete implements Observer {

    String name;

    public ObserverConcrete(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "에게 발송 되었습니다.");
    }
}

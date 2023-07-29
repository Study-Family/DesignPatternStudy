package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectConcrete implements Subject {

    List<Observer> observerList;
    String msg;

    public SubjectConcrete() {
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }
}

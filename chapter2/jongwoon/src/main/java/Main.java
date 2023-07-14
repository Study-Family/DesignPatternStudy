import observer.Observer;
import observer.ObserverConcrete;
import subject.Subject;
import subject.SubjectConcrete;

public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectConcrete();
        Observer observer1 = new ObserverConcrete("관찰자 1");
        Observer observer2 = new ObserverConcrete("관찰자 2");
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers();
    }
}
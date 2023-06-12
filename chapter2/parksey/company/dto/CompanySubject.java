package observerpattern.puzzle.company.dto;

import observerpattern.puzzle.user.dto.Observer;

public interface CompanySubject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

    String getName();
    int getPrice();
}

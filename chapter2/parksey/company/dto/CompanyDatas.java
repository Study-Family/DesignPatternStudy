package observerpattern.puzzle.company.dto;

import observerpattern.puzzle.company.domain.Company;
import observerpattern.puzzle.user.dto.Observer;
import observerpattern.puzzle.user.dto.UserObserver;

import java.util.ArrayList;
import java.util.List;

public class CompanyDatas implements CompanySubject{
    private String name;
    private int price;
    private List<Observer> observers;

    public CompanyDatas(String name, int price) {
        this.name = name;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public static CompanyDatas addSubject(Company company) {
        CompanyDatas companyDatas = new CompanyDatas(company.getName(), company.getPrice());
        company.getUsers().stream()
                .forEach(user -> UserObserver.toDto(companyDatas, user));

        return companyDatas;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observers.stream()
                .forEach(observer -> observer.notification());
    }

    public void updatePrice(int addPirce) {
        this.price += addPirce;
        notifyObserver();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

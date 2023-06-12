package observerpattern.puzzle.user.dto;

import observerpattern.puzzle.company.dto.CompanyDatas;
import observerpattern.puzzle.company.dto.CompanySubject;
import observerpattern.puzzle.user.domain.User;

public class UserObserver implements Observer {
    private CompanySubject companySubject;
    private String name;
    private int price;
    private User user;

    public UserObserver(CompanySubject companySubject, User user) {
        this.companySubject = companySubject;
        this.user = user;
        this.price = companySubject.getPrice();
        this.name = companySubject.getName();

        this.companySubject.addObserver(this);
    }

    public static UserObserver toDto(CompanySubject companySubject, User user) {
        return new UserObserver(companySubject, user);
    }

    @Override
    public void notification() {
        this.name = companySubject.getName();
        this.price = companySubject.getPrice();
    }
}

package observerpattern.puzzle.company.domain;

import observerpattern.puzzle.user.domain.User;

import java.util.ArrayList;
import java.util.List;

// entity
public class Company {
    private String name;
    private int price;

    private List<User> users;

    public Company(String name, int price) {
        this.name = name;
        this.price = price;

        this.users = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }
}

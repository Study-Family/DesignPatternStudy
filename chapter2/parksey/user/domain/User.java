package observerpattern.puzzle.user.domain;

public class User {
    private String name;
    private String personalData;

    public User(String name, String personalData) {
        this.name = name;
        this.personalData = personalData;
    }

    public String getName() {
        return name;
    }

    public String getPersonalData() {
        return personalData;
    }
}

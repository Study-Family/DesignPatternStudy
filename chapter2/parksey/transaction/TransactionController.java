package observerpattern.puzzle.transaction;

import observerpattern.puzzle.company.domain.Company;
import observerpattern.puzzle.company.dto.CompanyDatas;
import observerpattern.puzzle.user.domain.User;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class TransactionController {
    private static List<Company> initCompanys;
    private static List<User> initUsers;

    static {
        User user1 = new User("PSY", "010-XXXX-XXXX");
        User user2 = new User("PSY2", "010-XXXX-XXXX");

        initUsers = new ArrayList<>();
        initUsers.add(user1);
        initUsers.add(user2);

        Company sam = new Company("삼성", 70_000);
        sam.addUser(user1);
        sam.addUser(user2);

        Company auto = new Company("현대오토에버", 100_000);
        auto.addUser(user1);

        initCompanys = new ArrayList<>();
        initCompanys.add(sam);
        initCompanys.add(auto);
    }

    public TransactionController() {}

    public void trading() {
        List<CompanyDatas> companyDatasList = new ArrayList<>();
        initCompanys.stream()
                        .forEach(company -> companyDatasList.add(CompanyDatas.addSubject(company)));
        update(companyDatasList);
    }

    private void update(List<CompanyDatas> companyDatasList) {
        companyDatasList.stream()
                .forEach(companyDatas -> companyDatas.updatePrice(1000));
    }

}

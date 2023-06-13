package chapter2.observer;

import chapter2.subject.Company;

/**
 * 사용자의 화면에는 여러개의 UserConsoleView를 보고 있는것으로 가정하고 구현 하였다.
 * 각각의 UserConsoleView에서 각 Company를 참조 한다.
 */
public class UserConsoleView implements Observer {
	private final Company company;

	public UserConsoleView(Company company) {
		this.company = company;
	}

	@Override
	public void update() {
		display();
	}

	public void display() {
		System.out.println("company name: " +
			company.getCompanyName() + "\n" +
			company.getCompanyValue()
		);
	}
}

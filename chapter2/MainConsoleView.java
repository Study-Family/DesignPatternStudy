package chapter2;

import chapter2.observer.UserConsoleView;
import chapter2.subject.Company;

public class MainConsoleView {
	UserConsoleView firstView;
	UserConsoleView secondView;
	UserConsoleView thirdView;

	public MainConsoleView(Company c1,
		Company c2,
		Company c3) {
		this.firstView = new UserConsoleView(c1);
		this.secondView = new UserConsoleView(c2);
		this.thirdView = new UserConsoleView(c3);

		c1.registerObserver(this.firstView);
		c2.registerObserver(this.secondView);
		c3.registerObserver(this.thirdView);
	}

	public void displayAllView() {
		firstView.display();
		secondView.display();
		thirdView.display();
	}
}

package chapter2;

import chapter2.subject.Company;

public class MainConsoleViewTest {
	private Company c1;
	private Company c2;
	private Company c3;

	private MainConsoleView mainConsoleView;

	public void userClickCompany() {
		CompanyMenuView companyMenuView = new CompanyMenuView();

		this.c1 = companyMenuView.userClickKakao();
		this.c2 = companyMenuView.userClickLG();
		this.c3 = companyMenuView.userClickSamsung();
	}

	public void loadConsoleView() {
		this.mainConsoleView = new MainConsoleView(this.c1, this.c2, this.c3);
	}

	public void valueChangeTest() {
		this.c1.setCompanyValue(1500);
		this.c1.setCompanyValue(5000);
		this.c1.setCompanyValue(6000);

		this.c2.setCompanyValue(2400);
		this.c2.setCompanyValue(4400);
		this.c2.setCompanyValue(7400);

		this.c3.setCompanyValue(4000);
		this.c3.setCompanyValue(5000);
		this.c3.setCompanyValue(6000);
	}
}

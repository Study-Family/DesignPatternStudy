package chapter2;

import chapter2.subject.Company;
import chapter2.subject.Kakao;
import chapter2.subject.LG;
import chapter2.subject.Samsung;

public class CompanyMenuView {
	public Company userClickSamsung() {
		int curValue = 1000;
		return new Samsung(curValue);
	}

	public Company userClickLG() {
		int curValue = 1000;
		return new LG(curValue);
	}

	public Company userClickKakao() {
		int curValue = 1000;
		return new Kakao(curValue);
	}
}

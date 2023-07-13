package chapter2.subject;

import java.util.ArrayList;
import java.util.List;

import chapter2.observer.Observer;

public abstract class Company implements Subject {
	private final String name;
	private final List<Observer> observerList;
	private int companyValue;

	public Company(String name) {
		this.name = name;
		this.observerList = new ArrayList<>();
	}

	public String getCompanyName() {
		return this.name;
	}

	public int getCompanyValue() {
		return this.companyValue;
	}

	public void setCompanyValue(int companyValue) {
		this.companyValue = companyValue;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (var observer : observerList) {
			observer.update();
		}
	}
}

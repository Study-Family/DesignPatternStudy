package tmp.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockCompany implements Subject {
	public final String code;
	private final List<Double> dailyQuotes = new ArrayList<>();
	private final List<Observer> observers = new ArrayList<>();

	public StockCompany(String code) {
		this.code = code;
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public Double getDailyQuote() {
		int recentIdx = dailyQuotes.size() - 1;
		return dailyQuotes.get(recentIdx);
	}

	public void updateDailyQuote(Double dailyQuote) {
		dailyQuotes.add(dailyQuote);
		notifyObservers();
	}
}

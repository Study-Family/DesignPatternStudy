package tmp.observerPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subsribers implements Observer {
	private final String name;
	private final List<StockCompany> subscribingCompanies = new ArrayList<>();
	private final Map<String, Double> dailyQuoteByCompany = new HashMap<String, Double>();

	public Subsribers(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void update() {
		for(StockCompany company:subscribingCompanies){
			dailyQuoteByCompany.put(company.code, company.getDailyQuote());
		}
	}
}

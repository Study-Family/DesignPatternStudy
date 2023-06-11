package stock;

import stock.observer.Customer;
import stock.observer.StockCustomer;
import stock.stocks.repository.StocksRepository;
import stock.subject.Brokerage;
import stock.subject.SamsungBrokerage;

public class StockApp {
    public static void main(String[] args) {
        Brokerage brokerage = new SamsungBrokerage();
        StockCustomer customer1 = new Customer("김봉팔");
        StockCustomer customer2 = new Customer("김사지");
        customer1.addStocks(StocksRepository.STOCKS_MAP.get("Kakao"));
        customer1.addStocks(StocksRepository.STOCKS_MAP.get("Samsung"));

        customer2.addStocks(StocksRepository.STOCKS_MAP.get("Kakao"));
        customer2.addStocks(StocksRepository.STOCKS_MAP.get("Samsung"));
        customer2.addStocks(StocksRepository.STOCKS_MAP.get("Tesla"));

        brokerage.addCustomer(customer1);
        brokerage.addCustomer(customer2);
        brokerage.notifyToCustomer();
    }
}

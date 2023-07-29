package stock.subject;

import stock.observer.StockCustomer;
import stock.stocks.Stocks;
import stock.stocks.repository.StocksRepository;

import java.util.ArrayList;
import java.util.List;

public class SamsungBrokerage implements Brokerage {

    List<Stocks> stocksList;
    List<StockCustomer> customers;

    public SamsungBrokerage() {
        stocksList = new ArrayList<>();
        customers = new ArrayList<>();
        StocksRepository.STOCKS_MAP.forEach((a, b) -> {
            stocksList.add(b);
        });
    }

    @Override
    public void addCustomer(StockCustomer customer) {
        customers.add(customer);
    }

    @Override
    public void removeCustomer(StockCustomer customer) {
        customers.remove(customer);
    }

    @Override
    public void notifyToCustomer() {
        for (Stocks stock : stocksList) {
            stock.changeStockPrice();
        }
        for (StockCustomer customer : customers) {
            customer.update();
        }
    }
}

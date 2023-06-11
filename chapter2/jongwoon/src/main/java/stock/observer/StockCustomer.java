package stock.observer;

import stock.stocks.Stocks;

import java.util.ArrayList;
import java.util.List;

public abstract class StockCustomer {
    String customerName;
    List<Stocks> stockList = new ArrayList<>();

    public StockCustomer(String customerName) {
        this.customerName = customerName;
    }

    public abstract void update();

    public void addStocks(Stocks stocks) {
        stockList.add(stocks);
    }
}

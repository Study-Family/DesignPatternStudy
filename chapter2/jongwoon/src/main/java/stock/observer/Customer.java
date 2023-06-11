package stock.observer;

import stock.stocks.Stocks;

public class Customer extends StockCustomer {

    public Customer(String customerName) {
        super(customerName);
    }

    @Override
    public void update() {
        System.out.println(customerName + "의 포트폴리오");
        for (Stocks stock : stockList) {
            System.out.println(stock);
        }
    }
}

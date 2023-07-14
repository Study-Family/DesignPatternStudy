package stock.subject;

import stock.observer.StockCustomer;

public interface Brokerage {
    void addCustomer(StockCustomer customer);

    void removeCustomer(StockCustomer customer);

    void notifyToCustomer();
}

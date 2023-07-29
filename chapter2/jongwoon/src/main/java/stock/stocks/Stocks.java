package stock.stocks;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Stocks {
    protected String stockName;
    protected BigDecimal stockPrice;

    public Stocks(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
    }

    public void changeStockPrice() {
        int randomMenu = new Random().nextInt(2) + 1;
        int dollar = new Random().nextInt(2);
        switch (randomMenu) {
            case 1:
                BigDecimal addMoney = BigDecimal.valueOf(new Random().nextDouble() + dollar);
                stockPrice = stockPrice.add(addMoney);
                break;
            case 2:
                BigDecimal subtractMoney = BigDecimal.valueOf(new Random().nextDouble() + dollar);
                stockPrice = stockPrice.subtract(subtractMoney);
                break;
        }
    }

    @Override
    public String toString() {
        return "Stocks{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice=" + Math.round(stockPrice.doubleValue() * 100) / 100.0 +
                '}';
    }
}

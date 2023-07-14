package stock.stocks;

import java.math.BigDecimal;

public class Tesla extends Stocks {
    public Tesla(BigDecimal stockPrice) {
        super(stockPrice);
        stockName = "테슬라 주식";
    }
}

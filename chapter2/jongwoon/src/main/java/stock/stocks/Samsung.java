package stock.stocks;

import java.math.BigDecimal;

public class Samsung extends Stocks {
    public Samsung(BigDecimal stockPrice) {
        super(stockPrice);
        stockName = "삼성 주식";
    }
}

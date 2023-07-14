package stock.stocks;

import java.math.BigDecimal;

public class Kakao extends Stocks {
    public Kakao(BigDecimal stockPrice) {
        super(stockPrice);
        stockName = "카카오 주식";
    }
}

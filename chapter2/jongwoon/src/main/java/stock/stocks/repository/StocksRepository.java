package stock.stocks.repository;

import stock.stocks.Kakao;
import stock.stocks.Samsung;
import stock.stocks.Stocks;
import stock.stocks.Tesla;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

public class StocksRepository {
    public static final Map<String, Stocks> STOCKS_MAP = new LinkedHashMap<>();

    static {
        STOCKS_MAP.put("Kakao", new Kakao(new BigDecimal("43.8")));
        STOCKS_MAP.put("Samsung", new Samsung(new BigDecimal("55.91")));
        STOCKS_MAP.put("Tesla", new Tesla(new BigDecimal("244.4")));

        STOCKS_MAP.forEach((a, b) -> {
            System.out.println(a + "의 첫 주가 : " + b);
        });
    }
}

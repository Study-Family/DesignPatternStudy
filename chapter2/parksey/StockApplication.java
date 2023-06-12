package observerpattern.puzzle;

import observerpattern.puzzle.transaction.TransactionController;

public class StockApplication {
    public static void main(String[] args) {
        TransactionController stockController = new TransactionController();
        stockController.trading();

    }
}

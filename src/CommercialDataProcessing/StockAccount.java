package CommercialDataProcessing;

import java.util.ArrayList;
import java.util.Date;

public class StockAccount {
    private ArrayList<CompanyShares> companySharesList;

    public StockAccount() {
        companySharesList = new ArrayList<>();
    }

    public void buy(String stockSymbol, int numberOfShares) {

        Date transactionDateTime = new Date();

        CompanyShares newShares = new CompanyShares(stockSymbol, numberOfShares, transactionDateTime);
        companySharesList.add(newShares);

        System.out.println(numberOfShares + " shares of " + stockSymbol + " bought successfully.");
    }

    public void sell(String stockSymbol, int numberOfShares) {

        for (int i = 0; i < companySharesList.size(); i++) {
            if (companySharesList.get(i).getStockSymbol().equals(stockSymbol))
                companySharesList.remove(i);
        }

        System.out.println(numberOfShares + " shares of " + stockSymbol + " sold successfully.");
    }

    public void displayCompanyShares() {
        System.out.println("Company Shares:");

        for (CompanyShares shares : companySharesList) {
            System.out.println("Stock Symbol: " + shares.getStockSymbol());
            System.out.println("Number of Shares: " + shares.getNumberOfShares());
            System.out.println("Transaction Date and Time: " + shares.getTransactionDateTime());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount();

        stockAccount.buy("AAPL", 10);
        stockAccount.sell("GOOGL", 5);

        stockAccount.displayCompanyShares();
    }
}

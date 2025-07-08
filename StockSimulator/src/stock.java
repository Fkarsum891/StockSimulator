public class stock {
    private final String symbol;
    private Double marketPrice;
    private final String companyName;

    public stock(String symbol, Double marketPrice, String companyName) {
        this.symbol = symbol;
        this.marketPrice = marketPrice;
        this.companyName = companyName;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public String getCompanyName() {
        return companyName;
    }
}

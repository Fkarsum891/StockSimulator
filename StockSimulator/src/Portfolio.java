import java.util.HashMap;

public class Portfolio {
    private HashMap<String, Holding> holdings;


    public Portfolio(HashMap<String, Holding> holdings) {
        this.holdings = holdings;
    }

    public Holding getHoldings(String holdingName) {
        return this.holdings.get(holdingName);
    }

    public void addToHolding(String holdingName, Holding value) {
       this.holdings.computeIfAbsent("AAPL", key -> value);
        
    }

    public void removeFromHolding(String holdingName) {
        this.holdings.remove(holdingName);
    }
}

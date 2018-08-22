package strategy;

public class Price {
    private PriceStrategy strategy;

    public Price(PriceStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double getPrice(double price) {
        return strategy.calcPrice(price);
    }
}

package strategy;

public class GoldenMemberPriceStrategy implements PriceStrategy{
    @Override
    public double calcPrice(double price) {
        System.out.println("金牌会员9折");
        return price * 0.9;
    }
}

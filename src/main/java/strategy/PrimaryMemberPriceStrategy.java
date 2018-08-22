package strategy;

public class PrimaryMemberPriceStrategy implements PriceStrategy{
    @Override
    public double calcPrice(double price) {
        System.out.println("没有折扣");
        return price;
    }
}

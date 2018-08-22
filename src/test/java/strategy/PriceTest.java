package strategy;

import org.junit.Test;

import junit.framework.TestCase;

public class PriceTest {
    @Test
    public void priceTest() {
        Price price = new Price(new PrimaryMemberPriceStrategy());
        TestCase.assertEquals(100, price.getPrice(100), 0.000000001);
        price = new Price(new GoldenMemberPriceStrategy());
        TestCase.assertEquals(90, price.getPrice(100), 0.000000001);
    }
}

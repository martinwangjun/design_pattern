package flyweight;

import org.junit.Test;

import junit.framework.TestCase;

public class ConnectionFactoryTest {
    @Test
    public void getConnectionTest() {
        ConnectionFactory cf = new ConnectionFactory();
        DbConnection db1 = cf.getConnection("A");
        DbConnection db2 = cf.getConnection("B");
        DbConnection db3 = cf.getConnection("A");
        DbConnection db4 = cf.getConnection("A");
        DbConnection db5 = cf.getConnection("B");
        DbConnection db6 = cf.getConnection("A");
        
        TestCase.assertEquals(2, cf.getCurrentConnectionSize());
    }
}

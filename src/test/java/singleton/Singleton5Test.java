package singleton;

import org.junit.Test;

public class Singleton5Test implements Runnable{

    @Override
    public void run() {
        Singleton5.getInstance();
    }
    
    @Test
    public void test() {
        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(new Singleton5Test(), "T5");
            t.start();
        }
    }
    
}

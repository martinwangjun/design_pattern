package singleton;

import org.junit.Test;

public class Singleton3Test implements Runnable{

    @Override
    public void run() {
        Singleton3.getInstance();
    }
    
    @Test
    public void test() {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(new Singleton3Test(), "T");
            t.start();
        }
    }
}

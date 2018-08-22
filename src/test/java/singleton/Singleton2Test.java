package singleton;

import org.junit.Test;

public class Singleton2Test implements Runnable{
    @Override
    public void run() {
        Singleton2.getInstance();
    }
    
    @Test
    public void test() {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(new Singleton2Test(), "T");
            t.start();
        }
    }
}

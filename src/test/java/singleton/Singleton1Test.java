package singleton;

import org.junit.Test;

public class Singleton1Test implements Runnable{
    
    @Override
    public void run() {
        Singleton1.getInstance();
    }
    
    @Test
    public void test() {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(new Singleton1Test(), "T");
            t.start();
        }
    }
}

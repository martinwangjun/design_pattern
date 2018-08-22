package singleton;

import org.junit.Test;

public class Singleton6Test implements Runnable{
    
    
    @Override
    public void run() {
        Singleton6.INSTANCE.doSomething();
    }

    @Test
    public void test() {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(new Singleton6Test());
            t.start();
        }
    }
}

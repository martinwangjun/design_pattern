package singleton;

import org.junit.Test;

public class Singleton4Test implements Runnable{

    @Override
    public void run() {
        Singleton4.getInstance();
    }
    
    @Test
    public void test() {
        for (int i = 0; i < 10000; i++) {
            Thread t = new Thread(new Singleton4Test(), "T4");
            t.start();
        }
    }
    
}

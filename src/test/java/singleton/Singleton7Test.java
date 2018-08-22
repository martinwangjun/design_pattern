package singleton;

import org.junit.Test;

public class Singleton7Test implements Runnable{

    @Override
    public void run() {
        Singleton7.getInstance();
    }
    
    @Test
    public void test() {
        for (int i = 0; i < 100000; i++) {
            Thread t = new Thread(new Singleton7Test(), "T7");
            t.start();
        }
    }
}

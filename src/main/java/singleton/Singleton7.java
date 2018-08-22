package singleton;

public class Singleton7 {
    private static Singleton7 s7;
    
    private Singleton7() {
        System.out.println("构造函数被调用");
    }
    
    public static Singleton7 getInstance() {
        if(s7 == null) {
            synchronized (Singleton7.class) {  // A
                if(s7 == null) {                // B
                    s7 = new Singleton7();      // C
                }
            }
        }
        return s7;
    }
}

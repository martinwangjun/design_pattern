package singleton;

/**
 * 饿汉模式
 * 
 * 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时
 * 就实例化，虽然导致类装载的原因有很多种，在单例模式中大多数都是调用
 * getInstance方法，但是也不能确定有其他的方式（或者其他的静态方法）导致类装载
 * ，这时候初始化instance显然没有达到lazy loading的效果。
 * 
 * 和Singleton3类似，只是用了初始化块里调用构造函数来代替了在申明时调用构造函数
 * 
 * 线程安全
 * 
 * @author martin.wang
 *
 */
public class Singleton4 {
    private static Singleton4 s4 = null;
    
    static {
        s4 = new Singleton4();
    }
    
    private Singleton4(){
        System.out.println("构造器被调用");
    }
    
    public static Singleton4 getInstance(){
        return s4;
    }
}

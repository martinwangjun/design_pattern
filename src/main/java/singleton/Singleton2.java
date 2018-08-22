package singleton;

/**
 * 第二种（懒汉，线程安全）
 * 
 * 缺点: 效率太低
 * 
 *  这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading。
 *  但是，遗憾的是，效率很低，99%情况下不需要同步。
 * 
 * @author martin.wang
 *
 */
public class Singleton2 {
    private static Singleton2 s2;
    
    private Singleton2(){
        System.out.println("构造函数被调用!");
    }
    
    public static synchronized Singleton2 getInstance(){
        if(s2 == null){
            s2 = new Singleton2();
        }
        return s2;
    }
}

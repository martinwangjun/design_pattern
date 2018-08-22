package singleton;

/**
 * 第一种（懒汉，线程不安全）
 * 
 * 缺点: 线程不安全
 * 
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * 
 * @author martin.wang
 *
 */
public class Singleton1 {
    
    private static Singleton1 s1;
    
    private Singleton1(){
        System.out.println("构造函数被调用!");
    }
    
    public static Singleton1 getInstance(){
        if(s1 == null){
            s1 = new Singleton1();
        }
        return s1;
    }
}

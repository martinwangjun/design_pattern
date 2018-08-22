package singleton;

/**
 * 上面说到的静态内部类方式不失为一个高级的单例模式实现。
 * 但如果开发要求更严格一些，比如你的Singleton类实现了
 * 序列化，又或者想避免通过反射来破解单例模式的话，单例
 * 模式还可以有另一种形式。那就是枚举单例。枚举类型在
 * JDK1.5被引进。这种方式也是《Effective Java》作者
 * Josh Bloch 提倡的方式，它不仅能避免多线程的问题，而
 * 且还能防止反序列化重新创建新的对象、防止被反射攻击。
 * 
 * @author martin.wang
 *
 */
public enum Singleton6 {
    INSTANCE;
    
    private Singleton6() {
        System.out.println("构造函数被调用");
    }
    
    protected void doSomething() {
        
    }
}

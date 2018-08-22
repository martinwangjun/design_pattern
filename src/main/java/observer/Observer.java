package observer;

/**
 * 抽象观察者
 * 定义了一个update()方法，当被观察者调用notifyObserver()方法时，
 * 观察者的update()方法会被回调。
 * @author martin.wang
 *
 */
public interface Observer {
    public void update(String message);
}

package observer.wechat;

/**
 * 定义一个抽象观察者
 * 
 * @author martin.wang
 *
 */
public interface Observerable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}

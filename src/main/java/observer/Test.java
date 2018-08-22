package observer;

public class Test {
    public static void main(String[] args) {
        WechatServer server = new WechatServer();
        Observer lisa = new User("Lisa");
        Observer alice = new User("Alice");
        Observer ruby = new User("Ruby");
        
        server.registerObserver(lisa);
        server.registerObserver(alice);
        server.registerObserver(ruby);
        server.setInformation("PHP是最好的语言");
        
        System.out.println("----------------------------");
        server.removeObserver(lisa);
        server.setInformation("Java才是");
    }
}

package factory;

/**
 * 工厂模式的特例：简单工厂模式
 * 
 * 产品类：
 *  - 产品接口类：Car
 *  - 产品实现类：桑塔纳和飞度
 *  
 * 工厂类：
 *  - 工厂类：CarFactory
 * 
 * 客户类：
 *  - 调用者
 * 
 * @author martin.wang
 *
 */

interface Car{
    void test();
}

class Santana implements Car{
    @Override
    public void test() {
        System.out.println("测试Santana");
    }
}

class Fit implements Car{
    @Override
    public void test() {
        System.out.println("测试Fit");
    }
}

class CarFactory{
    public Car manufacture(int code) {
        Car car = null;
        switch (code) {
        case 1:
            car = new Fit();
            break;
        case 2:
            car = new Santana();
            break;
        default:
            break;
        }
        return car;
    }
}

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car c1 = cf.manufacture(1);
        Car c2 = cf.manufacture(2);
        c1.test();
        c2.test();
    }
}

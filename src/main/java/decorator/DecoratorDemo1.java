package decorator;

// Abstract Component
abstract class Phone{
    public abstract void call();
}

// ConcreteComponent
class Iphone extends Phone{

    @Override
    public void call() {
        System.out.println("使用iphone打电话。");
    }
}

// Abstract Decorator
abstract class MobilePhone extends Phone{
    protected Phone phone;
    public MobilePhone(Phone phone) {
        this.phone = phone;
    }
    @Override
    public void call() {
        phone.call();
    }
}

// Concrete Decorator
class RecordDevice extends MobilePhone{

    public RecordDevice(Phone phone) {
        super(phone);
    }
    
    private void start() {
        System.out.println("开始录音");
    }
    
    private void stop() {
        System.out.println("结束录音");
    }
    
    @Override
    public void call() {
        start();
        super.call();
        stop();
    }
    
    public void replay() {
        System.out.println("重放录音");
    }
}

class VedioCall extends MobilePhone{
    public VedioCall(Phone phone){
        super(phone);
    }
    
    private void openCamera(){
        System.out.println("打开摄像头");
    }
    
    private void closeCamera(){
        System.out.println("关闭摄像头");
    }
    
    @Override
    public void call() {
        openCamera();
        super.call();
        closeCamera();
    }
    
    public void takePhoto() {
        System.out.println("take a photo.");
    }
}

public class DecoratorDemo1 {
    public static void main(String[] args) {
        Phone p1 = new Iphone();
        Phone m1 = new RecordDevice(p1);
        Phone m2 = new VedioCall(m1);
        p1.call();
        System.out.println("-------------");
        m1.call();
        System.out.println("-------------");
        m2.call();
        System.out.println("-------------");
        RecordDevice r1 = new RecordDevice(m1);
        r1.call();
        r1.replay();
    }
}

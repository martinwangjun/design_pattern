package absfactory;

public class LinuxButton implements Button{
    @Override
    public void click() {
        System.out.println("在Linux下，点击了按钮。");       
    }
}

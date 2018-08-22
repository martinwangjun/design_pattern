package absfactory;

class WindowsButton implements Button{
    @Override
    public void click() {
        System.out.println("在Windows下，点击了按钮。");       
    }
}
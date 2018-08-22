package absfactory;

public class WindowsDropdownList implements DropdownList{
    @Override
    public void change() {
        System.out.println("在Windows下，下拉框修改了。");       
    }
}

package absfactory;

public class LinuxDropdownList implements DropdownList{
    @Override
    public void change() {
        System.out.println("在Linux下，下拉框修改了。");       
    }
}

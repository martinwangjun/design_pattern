package absfactory;

public class LinuxTextbox implements Textbox{
    @Override
    public void textChange() {
        System.out.println("在Linux下，文本框修改了。");       
    }
}

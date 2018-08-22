package absfactory;

class WindowsTextbox implements Textbox{
    @Override
    public void textChange() {
        System.out.println("在Windows下，文本框修改了。");       
    }
}
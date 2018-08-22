package absfactory;

public class WindowsUIFactory implements UIFactory{
    @Override
    public Button getButton() {
        return new WindowsButton();
    }

    @Override
    public Textbox getTextbox() {
        return new WindowsTextbox();
    }

    @Override
    public DropdownList getDropdownList() {
        return new WindowsDropdownList();
    }
}

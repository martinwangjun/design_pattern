package absfactory;

public class MacUIFactory implements UIFactory{

    @Override
    public Button getButton() {
        return new MacButton();
    }

    @Override
    public Textbox getTextbox() {
        return new MacTextbox();
    }

    @Override
    public DropdownList getDropdownList() {
        return new MacDropdownList();
    }
    
}

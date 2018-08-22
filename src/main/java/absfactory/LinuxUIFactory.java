package absfactory;

public class LinuxUIFactory implements UIFactory{
    @Override
    public Button getButton() {
        return new LinuxButton();
    }

    @Override
    public Textbox getTextbox() {
        return new LinuxTextbox();
    }

    @Override
    public DropdownList getDropdownList() {
        return new LinuxDropdownList();
    }
    
}

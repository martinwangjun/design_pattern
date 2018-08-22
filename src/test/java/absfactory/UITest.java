package absfactory;

import org.junit.Test;

public class UITest {
    
    @Test
    public void osUITest() {
    	// Windows的UI
        UIFactory uifWin = new WindowsUIFactory();
        Button btn1 = uifWin.getButton();
        DropdownList ddList1 = uifWin.getDropdownList();
        Textbox txt1 = uifWin.getTextbox();
        btn1.click();
        ddList1.change();
        txt1.textChange();
        
        // Mac的UI
        UIFactory uiMac = new MacUIFactory();
        Button btn3 = uiMac.getButton();
        btn3.click();
    }
}

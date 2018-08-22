package decorator;

import org.junit.Test;

public class PadTest {
    @Test
    public void webTest() {
        Pad pad = new IPad();
        pad.web();
        NetworkPad pad4G = new NetworkPad(pad);
        pad4G.web();
    }
}

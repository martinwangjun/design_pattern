package decorator;

class NetworkPad implements Pad{
    private Pad pad;

    public NetworkPad(Pad pad) {
        this.pad = pad;
    }

    @Override
    public void web() {
        System.out.println("提供4G网络");
        pad.web();
    }
    
    
}

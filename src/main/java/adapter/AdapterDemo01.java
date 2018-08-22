package adapter;

interface Target {
    void operate1();
    void operate2();
}

class Adaptee {
    public void operate1() {
        System.out.println("Operate 1 in Adaptee");
    }
}

class Adapter implements Target {

    private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void operate1() {
        adaptee.operate1();
    }

    @Override
    public void operate2() {
        System.out.println("Adapter Operate 2");
    }
    
}

public class AdapterDemo01 {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.operate1();
        
        target.operate2();
    }
}
package decorator;

abstract class Component{
    public abstract void operation();
}

class ConcreteCompenent extends Component{
    public void operation() {
        System.out.println("ConcreteComponent says.");
    }
}

//  抽象装饰器类和具体装饰器类
abstract class Decorator extends Component{
    protected Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    public void operation() {
        component.operation();
    }
}

class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }
    
    private void operationFirst() {
        System.out.println("operationFirst says.");
    }
    
    private void operationLast() {
        System.out.println("operationLast says.");
    }

    @Override
    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
    
    // 新功能
    public void anotherOperation() {
        System.out.println("another operation");
    }
}

public class Client {

    public static void main(String[] args) {
        Component c1 = new ConcreteCompenent();
        Decorator decoratorA = new ConcreteDecoratorA(c1);
        decoratorA.operation();
        System.out.println("---------分割线--------");
        Decorator decoratorBandA = new ConcreteDecoratorA(decoratorA);
        decoratorBandA.operation();
    }

}

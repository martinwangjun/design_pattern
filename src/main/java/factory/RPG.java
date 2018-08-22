package factory;

public class RPG implements Weapon{
    @Override
    public void shoot() {
        System.out.println("一颗RPG火箭弹，带着正义的火焰，呼啸着飞向前方");
    }
}

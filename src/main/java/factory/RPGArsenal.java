package factory;

public class RPGArsenal implements Arsenal{
    @Override
    public Weapon manufacture() {
        return new RPG();
    }
}

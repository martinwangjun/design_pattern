package factory;

class M16Arsenal implements Arsenal{
    @Override
    public Weapon manufacture() {
        return new M16();
    }
}

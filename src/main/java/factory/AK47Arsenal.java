package factory;

class AK47Arsenal implements Arsenal{
    
    @Override
    public Weapon manufacture() {
        return new AK47();
    }
}
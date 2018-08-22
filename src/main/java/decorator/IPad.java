package decorator;

public class IPad implements Pad{
    @Override
    public void web() {
        System.out.println("使用WIFI上网");
    }
    
}

package decorator;

import java.awt.Font;
import java.util.HashMap;
import java.util.Map;

interface FontProvider {
    public Font getFont(String name);
}
 
class DefaultFontProvider implements FontProvider {
    public Font getFont(String name) {
        return new Font(name, Font.PLAIN, 12);
    }
}
 
class BufferedFontProvider implements FontProvider {
 
    private FontProvider fontProvider;
    private Map<String, Font> fontCache = new HashMap<>();
 
    public BufferedFontProvider(FontProvider fontProvider) {
        this.fontProvider = fontProvider;
    }
 
    public Font getFont(String name) {
        if (!fontCache.containsKey(name)) {
            fontCache.put(name, fontProvider.getFont(name));
        }
        return fontCache.get(name);
    }
}

class NetFontProvider implements FontProvider{
    private FontProvider fontProvider;
    private Map<String, Font> fontCache = new HashMap<>();
    
    public NetFontProvider(FontProvider fontProvider) {
        this.fontProvider = fontProvider;
    }
    
    @Override
    public Font getFont(String name) {
        if(!fontCache.containsKey(name)) {
            fontCache.put(name, fontProvider.getFont(name));
        }
        return fontCache.get(name);
    }
}
 
public class FontDemo {
    //这里我们假设这个fontProvider对象是注入的。
    private static FontProvider fontProvider = new DefaultFontProvider();
 
    public static void main(String[] args) {
        Font font = fontProvider.getFont("微软雅黑");
        Font font2 = fontProvider.getFont("微软雅黑");
        System.out.println(font == font2);//false
 
        fontProvider = new BufferedFontProvider(fontProvider);
        Font font3 = fontProvider.getFont("微软雅黑");
        Font font4 = fontProvider.getFont("微软雅黑");
        System.out.println(font3 == font4);//true
        
        fontProvider = new NetFontProvider(fontProvider);
        Font font5 = fontProvider.getFont("宋体");
        Font font6 = fontProvider.getFont("宋体");
        System.out.println(font5 == font6);
    }
}
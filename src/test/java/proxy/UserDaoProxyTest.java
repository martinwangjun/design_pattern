package proxy;

import org.junit.Test;

public class UserDaoProxyTest {
//    // @Test
//    public void saveTest() {
//        UserDao target = new UserDao();
//        UserDaoProxy proxy = new UserDaoProxy(target);
//        proxy.save();
//    }
    
//    @Test
//    public void saveDynamicTest() {
//        IUserDao target = new UserDao();
//        System.out.println(target.getClass());
//        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
//        System.out.println(proxy.getClass()); // 内存中动态生成的代理对象
//        proxy.save();        
//    }
    
    @Test
    public void saveTest() {
        UserDao target = new UserDao();
        UserDao proxy = (UserDao) new StaffProxyFactory(target).getProxyInstance();
        proxy.save();
    }
}

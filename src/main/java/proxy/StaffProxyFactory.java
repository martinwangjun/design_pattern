package proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib子类代理工厂
 * 对UserDao在内存中动态构建一个子类对象
 */
public class StaffProxyFactory implements MethodInterceptor{
    //维护目标对象
    private Object target;
    public StaffProxyFactory(Object target) {
        this.target = target;
    }
    
    // 给目标对象创建一个代理对象
    public Object getProxyInstance() {
        // 工具类
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }
    
    @Override
    public Object intercept(Object obj, Method method, Object[] args,
            MethodProxy proxy) throws Throwable {
        System.out.println("------ 开始事务 ------");
        
        // 执行目标对象的方法
        Object returnValue = method.invoke(target, args);
        
        System.out.println("------ 结束事务 ------");
        return returnValue;
    }
}

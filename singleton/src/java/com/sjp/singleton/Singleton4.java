package java.com.sjp.singleton;

/**
 * 使用静态内部类的单例模式写法
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final  Singleton4 INSTANCE=new Singleton4();
    }
    private Singleton4(){}

    public static final Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

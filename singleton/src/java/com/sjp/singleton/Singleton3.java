package java.com.sjp.singleton;

/**
 * 3.饿汉式单例模式
 *
 * 变种写法：
 * private static Singleton3 instance=null;
 * static{
 *     instance=new Singleton3()
 * }
 */
public class Singleton3 {
    private static Singleton3 instance=new Singleton3();
    private Singleton3(){}

    public static Singleton3 getInstance() {
        return instance;
    }
}

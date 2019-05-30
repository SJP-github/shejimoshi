package java.com.sjp.singleton;
/**
 * 2.懒汉式，线程安全
 * 静态方法上加了 synchronized关键字
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance=new Singleton2();
        }
        return instance;
    }
}

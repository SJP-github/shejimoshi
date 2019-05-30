package java.com.sjp.singleton;

/**
 * 单例模式的双重校验锁写法
 */
public class Singleton6 {

    private volatile static Singleton6 singleton6;
    private Singleton6(){}

    public static Singleton6 getSingleton6() {
        if (singleton6 == null) {
            synchronized (Singleton6.class) {
                if (singleton6 == null) {
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}

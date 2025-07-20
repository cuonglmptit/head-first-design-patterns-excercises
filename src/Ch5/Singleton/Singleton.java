package Ch5.Singleton;

/**
 * Singleton – Lớp singleton để tạo duy nhất 1 instance.
 *
 * <p>
 * VD của Singleton Pattern.
 * Lớp này dù là đảm bảo nhiều thread không tạo được nhiều instance nhưng mà lại bị vấn đề hiệu năng
 * khi phải lock bằng synchronized
 * </p>
 *
 * @author cuonglmptit
 * @since Sunday, 20 July 2025
 */
public class Singleton {
    private static Singleton uniqueInstance;

    // other useful instance variables here
    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    // other useful methods here
}

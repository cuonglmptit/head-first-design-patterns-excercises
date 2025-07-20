package Ch5.Singleton;

/**
 * SingletonEager – Duy nhất 1 instance nhưng mà tạo ngay lập tức khi chạy chương trình mà chưa ai dùng.
 *
 * <p>
 * VD của Singleton Pattern.
 * Lớp này dù là đảm bảo nhiều thread không tạo được nhiều instance và hiệu năng nhưng nó lại tốn tài nguyên ban đầu
 * vì phải tạo ngay lập tức instance khi chạy chương trình dù chưa có thread nào dùng.
 * </p>
 *
 * @author cuonglmptit
 * @since Sunday, 20 July 2025
 */
public class SingletonEager {
    private static SingletonEager uniqueInstance = new SingletonEager();

    // other useful instance variables here
    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return uniqueInstance;
    }

}

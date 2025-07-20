package Ch5.Singleton;

/**
 * SingletonVolatile – Sử dụng double checking để đảm bảo nhiều thread vào 1 lúc được mà vẫn chỉ tạo 1 instance lần đầu.
 *
 * <p>
 * Sử dụng volatile để double check instance tránh tạo nhiều instance, tránh tạo mà ko dùng đến
 * mà vẫn giữ được cho nhiều thread cùng 1 lúc truy cập.
 * </p>
 *
 * @author cuonglmptit
 * @since Sunday, 20 July 2025
 */
public class SingletonVolatile {
    private volatile static SingletonVolatile uniqueInstance;

    private SingletonVolatile() {
    }

    public static SingletonVolatile getInstance() {
        //First check
        if (uniqueInstance == null)
            //Double check
            synchronized (SingletonVolatile.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonVolatile();
                }
            }
        return uniqueInstance;
    }
}

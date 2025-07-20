package Ch5.Singleton;

/**
 * SingletonInitializationOnDemand – Tạo theo yêu cầu.
 *
 * <p>
 * 1. Lớp InstanceHolder chưa được load vào JVM cho đến khi getInstance() được gọi lần đầu tiên. <br>
 * 2. Khi getInstance() được gọi:<br>
 * JVM sẽ load class InstanceHolder lần đầu.<br>
 * Theo đặc tả Java (JLS), quá trình class loading là thread-safe.<br>
 * Biến INSTANCE được khởi tạo đúng 1 lần duy nhất.<br>
 * 3. Kết quả: Lazy initialization, nhưng vẫn an toàn tuyệt đối trong môi trường đa luồng, mà không cần synchronized hay volatile.
 * <br>
 * <strong>*Note:</strong>
 * Cách này chỉ hoạt động đúng trong Java, không áp dụng được nguyên si sang các ngôn ngữ như C++.<br>
 * Nó thường được xem là cách tốt nhất để viết Singleton trong Java trừ khi bạn có yêu cầu đặc biệt.
 * </p>
 *
 * @author cuonglmptit
 * @since Sunday, 20 July 2025
 */
public class SingletonInitializationOnDemand {
    private static class InstanceHolder {
        private static final SingletonInitializationOnDemand INSTANCE = new SingletonInitializationOnDemand();
    }

    public static SingletonInitializationOnDemand getInstance() {
        return InstanceHolder.INSTANCE;
    }

    // private constructor and other methods...
}

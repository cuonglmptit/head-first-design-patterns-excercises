package Ch5.Singleton.ChocOHolic;

/**
 * Client – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 21 July 2025
 */
public class Client {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.UNIQUE_INSTANCE;

        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}

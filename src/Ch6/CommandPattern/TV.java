package Ch6.CommandPattern;

/**
 * TV – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 25 August 2025
 */
public class TV {
    private String location;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is On");
    }

    public void off() {
        System.out.println(location + " TV is Off");
    }
}

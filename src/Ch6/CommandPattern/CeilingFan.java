package Ch6.CommandPattern;

/**
 * CeilingFan – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF; // Mặc định tốc độ là 0 (tắt)
    }

    public void high() {
        // Tốc độ cao
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        // Tốc độ trung bình
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // Tốc độ thấp
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // Tắt quạt
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}

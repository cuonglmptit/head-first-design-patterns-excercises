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
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = 0; // Mặc định tốc độ là 0 (tắt)
    }

    public void high() {
        speed = 3; // Tốc độ cao
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium() {
        speed = 2; // Tốc độ trung bình
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        speed = 1; // Tốc độ thấp
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        speed = 0; // Tắt quạt
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}

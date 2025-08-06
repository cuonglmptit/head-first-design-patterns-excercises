package Ch6.CommandPattern;

/**
 * GarageDoor – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Wednesday, 06 August 2025
 */
public class GarageDoor {
    public GarageDoor() {
    }

    // Mở cửa gara
    public void up() {
        System.out.println("Garage Door is Open");
    }

    // Đóng cửa gara
    public void down() {
        System.out.println("Garage Door is Closed");
    }

    // Dừng cửa gara
    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    // Bật đèn cửa gara
    public void lightOn() {
        System.out.println("Garage Door Light is On");
    }

    // Tắt đèn cửa gara
    public void lightOff() {
        System.out.println("Garage Door Light is Off");
    }
}

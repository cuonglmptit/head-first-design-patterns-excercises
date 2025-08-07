package Ch6.CommandPattern;

/**
 * Stereo – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is On");
    }

    public void off() {
        System.out.println(location + " Stereo is Off");
    }

    public void setCD() {
        System.out.println(location + " Stereo is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Stereo volume set to " + volume);
    }
}

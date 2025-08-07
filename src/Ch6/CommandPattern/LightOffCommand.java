package Ch6.CommandPattern;

/**
 * LightOffCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Tắt đèn
        light.off();
    }

    @Override
    public void undo() {
        // Bật đèn
        light.on();
    }
}

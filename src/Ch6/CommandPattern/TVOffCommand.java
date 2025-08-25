package Ch6.CommandPattern;

/**
 * TVOffCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 25 August 2025
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // Tắt TV
        tv.off();
    }

    @Override
    public void undo() {
        // Bật TV
        tv.on();
    }
}

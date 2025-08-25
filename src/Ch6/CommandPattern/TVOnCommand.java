package Ch6.CommandPattern;

/**
 * TVOnCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 25 August 2025
 */
public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        // Bật TV
        tv.on();
    }

    @Override
    public void undo() {
        // Tắt TV
        tv.off();
    }
}

package Ch6.CommandPattern;

/**
 * HottubOffCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 25 August 2025
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
        hottub.circulate();
    }

    @Override
    public void undo() {
        hottub.on();
        hottub.setTemperature(104);
    }
}

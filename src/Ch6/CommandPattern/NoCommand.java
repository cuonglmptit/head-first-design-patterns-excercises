package Ch6.CommandPattern;

/**
 * NoCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        // Không làm gì cả
    }

    @Override
    public void undo() {
        // Không làm gì cả
    }
}

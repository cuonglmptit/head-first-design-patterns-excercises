package Ch6.CommandPattern;

/**
 * GarageDoorCloseCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class GarageDoorDownCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        // Đóng cửa gara
        garageDoor.down();
    }

    @Override
    public void undo() {
        // Mở cửa gara
        garageDoor.up();
    }
}

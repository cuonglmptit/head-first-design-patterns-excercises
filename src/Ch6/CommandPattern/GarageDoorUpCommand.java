package Ch6.CommandPattern;

/**
 * GarageDoorOpenCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Wednesday, 06 August 2025
 */
public class GarageDoorUpCommand implements Command{
    private GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        // Mở cửa gara
        garageDoor.up();
    }

    @Override
    public void undo() {
        // Đóng cửa gara
        garageDoor.down();
    }
}

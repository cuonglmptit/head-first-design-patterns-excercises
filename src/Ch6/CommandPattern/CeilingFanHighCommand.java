package Ch6.CommandPattern;

/**
 * CeilingFanHighCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Wednesday, 20 August 2025
 */
public class CeilingFanHighCommand implements Command{
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // Lưu tốc độ trước khi thay đổi
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        // Khôi phục tốc độ trước đó
        if(prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else {
            ceilingFan.off();
        }
    }
}

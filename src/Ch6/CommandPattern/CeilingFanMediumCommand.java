package Ch6.CommandPattern;

/**
 * CeilingFanMediumCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Wednesday, 20 August 2025
 */
public class CeilingFanMediumCommand implements Command{
    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        // Lưu tốc độ trước đó
        prevSpeed = ceilingFan.getSpeed();
        // Đặt tốc độ quạt ở mức trung bình
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        // Khôi phục tốc độ quạt về tốc độ trước đó
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}

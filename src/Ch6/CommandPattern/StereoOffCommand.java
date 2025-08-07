package Ch6.CommandPattern;

/**
 * StereoOffCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class StereoOffCommand implements Command{
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        // Tắt Stereo
        stereo.off();
    }

    @Override
    public void undo() {
        // Bật Stereo
        stereo.on();
    }
}

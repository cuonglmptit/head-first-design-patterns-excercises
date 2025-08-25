package Ch6.CommandPattern;

/**
 * MacroCommand – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Monday, 25 August 2025
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MacroCommand{");
        for (Command command : commands) {
            sb.append(command.toString()).append(", ");
        }
        if (commands.length > 0) {
            sb.setLength(sb.length() - 2); // Xóa dấu phẩy và khoảng trắng cuối cùng
        }
        sb.append('}');
        return sb.toString();
    }
}

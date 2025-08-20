package Ch6.CommandPattern;

/**
 * RemoteControl – Mô_tả_ngắn_về_lớp.
 *
 * <p>
 * Mô_tả_chi_tiết.
 * </p>
 *
 * @author cuonglmptit
 * @since Thursday, 07 August 2025
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    // Hàm setCommand
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    // Hàm onButtonWasPushed
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    // Hàm offButtonWasPushed
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    // Hàm undoButtonWasPushed
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        stringBuilder.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return stringBuilder.toString();
    }
}

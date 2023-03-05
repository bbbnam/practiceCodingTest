package refactoring.chapter1.after;

public class Robot {
    private final String _name;
    public static final RobotCommand COMMAND_WALK = new RobotCommand("WALK");
    public static final RobotCommand COMMAND_JUMP = new RobotCommand("JUMP");
    public static final RobotCommand COMMAND_STOP = new RobotCommand("STOP");

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(RobotCommand command) {
        if (command == COMMAND_WALK) {
            System.out.println(_name + " walks."); //if문을 줄일 방법은?
        } else if (command == COMMAND_STOP) {
            System.out.println(_name + " stops.");
        } else if (command == COMMAND_JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}

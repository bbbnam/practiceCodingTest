package refactoring.enumafter;

public class Robot {
    private final String _name;
    public enum Command {
        WALK,
        STOP,
        JUMP
    }

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(Robot.Command command) {
        if (command == Command.WALK) {
            System.out.println(_name + " walks."); //if문을 줄일 방법은?
        } else if (command == Command.STOP) {
            System.out.println(_name + " stops.");
        } else if (command == Command.JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}

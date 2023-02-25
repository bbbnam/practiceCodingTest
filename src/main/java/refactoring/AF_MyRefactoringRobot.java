package refactoring;

public class AF_MyRefactoringRobot {
    private final String _name;
    public static final int WALKS_COMMAND = 0;
    public static final int STOPS_COMMAND = 1;
    public static final int JUMPS_COMMAND = 2;

    public AF_MyRefactoringRobot(String name) {
        this._name = name;
    }

    public void order(int command) {
        if (command == WALKS_COMMAND) {
            System.out.println(_name + " walks.");
        } else if (command == STOPS_COMMAND) {
            System.out.println(_name + " stops.");
        } else if (command == JUMPS_COMMAND) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}

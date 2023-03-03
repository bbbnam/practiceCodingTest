package refactoring.enumafter;

public class Robot {
    private final String _name;
    public enum Command { // 이 enum은 별도로 두는게 어떤지?
        WALK,
        STOP,
        JUMP
    }

    public Robot(String _name) {
        this._name = _name;
    }

    //이런식으로 파라미터를 받아야 컴파일 시 에러 발견이 용이하다
    public void order(Robot.Command command) {
        if (command == Command.WALK) {
            System.out.println(_name + " walks.");
        } else if (command == Command.STOP) {
            System.out.println(_name + " stops.");
        } else if (command == Command.JUMP) {
            System.out.println(_name + " jumps.");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}

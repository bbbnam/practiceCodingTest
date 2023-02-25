package refactoring;

import static refactoring.AF_MyRefactoringRobot.*;

public class Main {
    public static void main(String[] args) {
        BF_RefactoringRobot robot_1 = new BF_RefactoringRobot("Andrew");
        robot_1.order(WALKS_COMMAND); // walk
        robot_1.order(STOPS_COMMAND); // stop
        robot_1.order(JUMPS_COMMAND); // jump
    }
}

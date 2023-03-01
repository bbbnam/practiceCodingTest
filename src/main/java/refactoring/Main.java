package refactoring;

import refactoring.enumafter.Robot;

import static refactoring.AF_MyRefactoringRobot.*;

public class Main {
    public static void main(String[] args) {
//        BF_RefactoringRobot robot_1 = new BF_RefactoringRobot("Andrew");
//        robot_1.order(WALKS_COMMAND);
//        robot_1.order(STOPS_COMMAND);
//        robot_1.order(JUMPS_COMMAND);

//        Robot robot = new Robot("Andrew");
//        robot.order(Robot.COMMAND_WALK);
//        robot.order(Robot.COMMAND_JUMP);
//        robot.order(Robot.COMMAND_STOP);

        Robot robot = new Robot("Andrew");
        robot.order(Robot.Command.WALK);
        robot.order(Robot.Command.STOP);
        robot.order(Robot.Command.JUMP);
    }
}

package refactoring;

public class Main {
    public static void main(String[] args) {
        BF_RefactoringRobot robot_1 = new BF_RefactoringRobot("Andrew");
        robot_1.order(0); // walk
        robot_1.order(1); // stop
        robot_1.order(2); // jump
    }
}

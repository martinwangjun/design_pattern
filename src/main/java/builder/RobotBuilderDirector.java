package builder;

public class RobotBuilderDirector {
    public Robot createRobotByDirector(IRobotBuilder rb) {
        rb.buildHead();
        rb.buildBody();
        rb.buildArm();
        rb.buildLeg();
        return rb.createRobot();
    }
}

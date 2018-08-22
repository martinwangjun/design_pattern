package builder;

public interface IRobotBuilder {
    void buildHead();
    void buildBody();
    void buildArm();
    void buildLeg();
    Robot createRobot();
}

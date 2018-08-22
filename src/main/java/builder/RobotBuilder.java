package builder;

public class RobotBuilder implements IRobotBuilder {
    private Robot robot;
    
    public RobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("智商180的脑袋");
    }

    @Override
    public void buildBody() {
        robot.setBody("史泰龙的身体");
    }

    @Override
    public void buildArm() {
        robot.setArm("施瓦辛格的手臂");
    }

    @Override
    public void buildLeg() {
        robot.setLeg("C罗的大腿");
    }

    @Override
    public Robot createRobot() {
        return robot;
    }
}

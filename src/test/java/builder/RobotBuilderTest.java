package builder;

import org.junit.Test;

public class RobotBuilderTest {
    @Test
    public void robotBuilderTest() {
        RobotBuilderDirector director = new RobotBuilderDirector();
        Robot robot = director.createRobotByDirector(new RobotBuilder());
        System.out.println(robot.getHead());
        System.out.println(robot.getBody());
        System.out.println(robot.getArm());
        System.out.println(robot.getLeg());
    }
}

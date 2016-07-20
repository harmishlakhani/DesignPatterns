package com.github.builder;

public class TestRobotBuilder {

	public static void main(String[] args) {
		
		RobotBuilder robotBuilder = new OldRobotBuilder();
		RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
		robotEngineer.makeRobot();
		Robot robot = robotEngineer.getRobot();
		
		System.out.println(robot.getRobotHead());
		System.out.println(robot.getRobotTorso());
		System.out.println(robot.getRobotArms());
		System.out.println(robot.getRobotLegs());
	}
}

package team6829.common;

import wpilib.common.FakeRobotDrive;

public class TestDriveTrain {
	
	public boolean TestDrive() {
		FakeRobotDrive robotDrive = new FakeRobotDrive(1,2,3,4);
		BasicDriveTrain driveTrain = new BasicDriveTrain(robotDrive);
		driveTrain.drive(40);
		if (robotDrive.leftPower == 40 && robotDrive.rightPower == 40)
		{
		return true;
		}
		return false;

}

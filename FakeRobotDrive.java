package wpilib.common;

import edu.wpi.first.wpilibj.RobotDrive;

public class FakeRobotDrive extends RobotDrive {



    
	public FakeRobotDrive(int frontLeftMotor, int rearLeftMotor, int frontRightMotor, int rearRightMotor) {
		super(frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor);
		// TODO Auto-generated constructor stub
	}
	public double leftPower = Double.MIN_VALUE;
    public double rightPower = Double.MIN_VALUE;
	public void setLeftRightMotorOutputs(double leftPower, double rightPower) {
	
		this.leftPower = leftPower;
		this.rightPower = rightPower;
	}
}

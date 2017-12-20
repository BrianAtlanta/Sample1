package team6829.common;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;


public class BasicDriveTrain extends Subsystem {

	private RobotDrive robotDrive;
	public BasicDriveTrain() {
		CANTalon leftFrontMotor = new CANTalon(1);
		CANTalon leftRearMotor = new CANTalon(2);
		CANTalon rightRearMotor  = new CANTalon(3);
		CANTalon righFrontMotor = new CANTalon(4);
		robotDrive = new RobotDrive(leftFrontMotor, leftRearMotor, rightRearMotor, righFrontMotor);
		
	}
	public BasicDriveTrain( RobotDrive robotDrive	) {
		
		this.robotDrive = robotDrive;
	}
	
	public void setDefaultCommand(Command defaultCommand) {
		
	}

	public void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	public void drive(double throttlePower, double turnPower) {
		
		
	}

	public void drive(double power) {
		robotDrive.setLeftRightMotorOutputs(power, power);
		
	}

	public void turn(double power) {
		// TODO Auto-generated method stub
		
	}

	public void stop() {
		// TODO Auto-generated method stub
		
	}

}

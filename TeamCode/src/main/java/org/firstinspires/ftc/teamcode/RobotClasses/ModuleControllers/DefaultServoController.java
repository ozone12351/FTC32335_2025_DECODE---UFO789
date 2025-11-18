package org.firstinspires.ftc.teamcode.RobotClasses.ModuleControllers;

import com.qualcomm.robotcore.hardware.Servo;

public class DefaultServoController {

    public int angle; // current angle of servo
    private Servo servo; // creates the servo object
    private double rangeMin = 0; // Min range for the servo
    private double rangeMax = 1; // Max range for the servo

    public DefaultServoController(Servo servoName) {
        this.servo = servoName;
        this.angle = 0;

        servo.scaleRange(rangeMin, rangeMax); // Set the servo range
    }

    public void setServoPosition(int angle) {
        double position = (double) angle / 180; // Converts degrees to a value between 0 - 1
        servo.setPosition(position); // Set the actual position using the 0 - 1 value
    }

    public void setZero() { servo.setPosition(0.0); }

    public void setMax() { servo.setPosition(1.0); }

}


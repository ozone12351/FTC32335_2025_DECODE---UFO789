package org.firstinspires.ftc.teamcode.RobotClasses.ModuleControllers;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.Config;

public class MG996RController {

    private CRServo servo;
    public int angle;

    public MG996RController(HardwareMap hardwareMap, final String ServoName) {
        this.servo = hardwareMap.get(CRServo.class, ServoName);           // init the actual servo
        this.angle = 0;                                                   // init to 0 (default)
    }

    public void setReverse() { servo.setPower(-1.0); }

    public void setForwards() { servo.setPower(1.0); }

    public void setStop() { servo.setPower(0); }

    public void setPower(double power) { servo.setPower(power); }

}

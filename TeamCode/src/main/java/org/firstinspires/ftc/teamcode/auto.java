package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.RobotClasses.RobotController;

@Autonomous(name = "autonomous", group = "Test")
public class auto extends LinearOpMode {

    RobotController robotController;

    @Override
    public void runOpMode() {

        robotController = new RobotController();
        robotController.autoInit(hardwareMap);

        waitForStart();

        telemetry.addLine("Program started");
        telemetry.update();

        robotController.strafeLeft(24);
        sleep(100);
        robotController.turnTo(90);
        sleep(100);
        robotController.moveForward(36);
        sleep(100);

        //robotController.moveForward(12);
        //robotController.moveForward(39.37);
        //sleep(200);
        //robotController.turnTo(90);
        //sleep(200);
        //robotController.moveBackward(19.69);
        //sleep(200);
        //robotController.turnDegrees(180);
        //sleep(200);
        //robotController.moveBackward(19.69);
        //sleep(200);
        //robotController.turnDegrees(-90);
        //sleep(200);
        //robotController.moveForward(39.37);

        telemetry.addLine("Done");
        telemetry.update();

    }

}

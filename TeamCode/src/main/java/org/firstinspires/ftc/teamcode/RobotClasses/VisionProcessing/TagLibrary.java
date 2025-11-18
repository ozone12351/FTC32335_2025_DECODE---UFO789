package org.firstinspires.ftc.teamcode.RobotClasses.VisionProcessing;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.teamcode.Config;
import org.firstinspires.ftc.vision.apriltag.AprilTagLibrary;

public class TagLibrary {

    // builds the april tag library to use for processing
    public static AprilTagLibrary getLibrary() {

        double aprilTagSize = Config.aprilTagSize;

        return new AprilTagLibrary.Builder()
                .addTag(20, "BLUE", aprilTagSize, DistanceUnit.CM)
                .addTag(21, "GPP", aprilTagSize, DistanceUnit.CM)
                .addTag(22, "PGP", aprilTagSize, DistanceUnit.CM)
                .addTag(23, "PPG", aprilTagSize, DistanceUnit.CM)
                .addTag(24, "RED", aprilTagSize, DistanceUnit.CM)
                .build();

    }

}

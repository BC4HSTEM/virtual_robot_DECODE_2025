package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        int teamNumber = 16072;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;
        String myName = "Zion Koko";

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Moter Speed", motorSpeed);
        telemetry.addData("Touch sensor", touchSensorPressed);
        telemetry.addData("Hello", "Zion Koko");
    }

    @Override
    public void loop() {
    }
}
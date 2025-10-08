package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class HelloWorldLydia extends OpMode {

    @Override
    public void init(){
        telemetry.addData("Hello","World");
    }

    @Override
    public void loop (){
        telemetry.addData("Starting","the OpMode");
        telemetry.addData("Telemetry","Output example");
    }
}

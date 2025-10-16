package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;


@TeleOp()
public class GamepadOpModeMajesty extends OpMode{
    @Override
      public void init() {

    }
       @Override
    public void loop() {
        telemetry.addData("Left stick x",gamepad1.left_stick_x);
        telemetry.addData("left stick y",gamepad1.left_stick_y);
        telemetry.addData("A button",gamepad1.a);
        }
}

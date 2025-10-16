package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class ClassMemberOpModeZion extends OpMode {
    boolean initDone;

@Override
public void init() {
    telemetry.addData("init Done", initDone)
     initDone = true;
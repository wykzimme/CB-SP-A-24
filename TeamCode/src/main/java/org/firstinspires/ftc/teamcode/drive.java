 package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "drive")
public class drive extends OpMode {

    DcMotor topleft, topright;
    DcMotor backleft, backright;


    @Override
    public void init() {
        topleft = hardwareMap.get(DcMotor.class, "topleft");
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        topright = hardwareMap.get(DcMotor.class, "topright");
        backright = hardwareMap.get(DcMotor.class, "backright");




    }

    @Override
    public void loop() {
        topleft.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + gamepad1.right_stick_x);
        backleft.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + -gamepad1.left_stick_x);
        topright.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + -gamepad1.left_stick_x);
        backright.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + gamepad1.left_stick_x);

    }
}
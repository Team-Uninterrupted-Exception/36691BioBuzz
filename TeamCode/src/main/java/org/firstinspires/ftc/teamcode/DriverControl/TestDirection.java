package org.firstinspires.ftc.teamcode.DriverControl;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
@TeleOp
public class TestDirection extends OpMode {
    Drivetrain drivetrain;
    @Override
    public void init() {
        drivetrain = new Drivetrain(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            drivetrain.backLeft.setPower(.5);
        }
        if (gamepad1.b) {
            drivetrain.backRight.setPower(.5);
        }
        if (gamepad1.x) {
            drivetrain.frontLeft.setPower(.5);
        }
        if (gamepad1.y) {
            drivetrain.frontRight.setPower(.5);
        }

        telemetry.addData("Direction - frontRight", drivetrain.frontRight.getDirection());
        telemetry.addData("Direction - frontLeft", drivetrain.frontLeft.getDirection());
        telemetry.addData("Direction - backRight", drivetrain.backRight.getDirection());
        telemetry.addData("Direction - backLeft", drivetrain.backLeft.getDirection());
        telemetry.update();
    }
}

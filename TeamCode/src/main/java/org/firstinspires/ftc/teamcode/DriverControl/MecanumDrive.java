package org.firstinspires.ftc.teamcode.DriverControl;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.Subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;

@TeleOp
public class MecanumDrive extends OpMode {
    Drivetrain drivetrain;
//    Intake intake;

    @Override
    public void init() { // called once when INIT is pressed
        drivetrain = new Drivetrain(hardwareMap);
//        intake = new Intake(hardwareMap);

        telemetry.addData("Status", "Initialized"); // Displays this on Driver Station
        telemetry.update(); // updates the telemetry on the screen
    }

    public void start() {} // called once after ▶ is pressed

    public void loop() { // loops after ▶ is pressed
        telemetry.addData("Status", "Started");

        double leftJoyX = gamepad1.left_stick_x; // strafe
        double leftJoyY = -gamepad1.left_stick_y; // forward
        double rightJoyX = gamepad1.right_stick_x; // turn
        // NOTE: Xbox controllers are not compatible with FTCRobotController. The right stick is
        // nonfunctional. Not only does the right stick not work, pressing the left trigger causes
        // the right stick to read as the -input and does not return back to 0.

        telemetry.addData("leftJoyX",leftJoyX);
        telemetry.addData("leftJoyY",leftJoyY);
        telemetry.addData("rightJoyX",rightJoyX);

        drivetrain.mecanumDriveSimple(leftJoyY, leftJoyX, rightJoyX);

        telemetry.update();
    }
}

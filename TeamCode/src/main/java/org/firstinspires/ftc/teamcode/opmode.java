package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Apexopmode2 (Blocks to Java)")
public class opmode extends LinearOpMode {

    private DcMotor leftRear;
    private DcMotor leftFront;
    private DcMotor rightRear;
    private DcMotor rightFront;

        double drive;
        double turn;
        double strafe;
    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");


        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here

            drive = gamepad1.right_stick_y;
            turn = gamepad1.right_stick_x;
            strafe = gamepad1.left_stick_x;


            leftRear.setPower(drive - strafe  + turn);
            leftFront.setPower(drive + strafe + turn);
            rightRear.setPower(drive + strafe - turn);
            rightFront.setPower(drive - strafe - turn);
        }
    }
}

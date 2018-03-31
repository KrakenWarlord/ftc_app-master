package org.firstinspires.ftc.teamcode.States.Motors;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.engine.Engine;
import org.engine.State;

/**
 * Created by Mason on 3/31/2018.
 */

public class DCDrive extends State {
    private DcMotor Motor;
    //Constructor
    public DCDrive(Engine localengine){
        this.engine=localengine;
    }
    @Override
    public void init(){
        Motor = this.engine.hardwareMap.dcMotor.get("Motor");
    }

    @Override
    public void exec() {
        Motor.setPower(1.0);
    }
}

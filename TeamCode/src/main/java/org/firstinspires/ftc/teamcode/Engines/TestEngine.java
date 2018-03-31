package org.firstinspires.ftc.teamcode.Engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.States.Motors.DCDrive;

/**
 * Created by Mason on 3/31/2018.
 */
@Autonomous(name="TestEngine")
public class TestEngine extends Engine {
    @Override
    public void setProcesses() {
addState(new DCDrive(this));
    }
}

package org.firstinspires.ftc.teamcode.Engines;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.engine.Engine;
import org.firstinspires.ftc.teamcode.States.Motors.ServoState;

/**
 * Created by Mason on 4/7/2018.
 */
@Autonomous(name="Servo Engine")
public class ServoEngine extends Engine {
    @Override
    public void setProcesses() {
        addState(new ServoState(this,0.5));
        addState(new ServoState(this,0.0));
        addState(new ServoState(this,0.75));
        addState(new ServoState(this,0.001));
        addState(new ServoState(this,0.55));
        addState(new ServoState(this,0.9));
        addState(new ServoState(this,0.99));
        addState(new ServoState(this,0.9));
        addState(new ServoState(this,0.99));
        addState(new ServoState(this,0.9));
        addState(new ServoState(this,0.99));
        addState(new ServoState(this,0.9));
        addState(new ServoState(this,0.99));
        addState(new ServoState(this,0.9));
        addState(new ServoState(this,0.99));
        addState(new ServoState(this,0.9));
        addState(new ServoState(this,0.99));
        addState(new ServoState(this,0.9));
    }
}

package carwash;

import random.ExponentialRandomStream;
import random.UniformRandomStream;
import simulator.SimEvent;
import simulator.SimState;

/**
 * Created by emilaasa on 02/03/16.
 */
public class CarWashState implements SimState {

    double elapsedSimulationTime = 0;

    ExponentialRandomStream exponentialRandomStream;
    UniformRandomStream slowDist;
    UniformRandomStream fastDist;

    public CarWashState(ExponentialRandomStream exponentialRandomStream, UniformRandomStream slowDist) {
        this.exponentialRandomStream = exponentialRandomStream;
        this.slowDist = slowDist;

    }

    @Override
    public SimEvent addStartEvent() {
        return new CarWashStart(this);
    }

    @Override
    public SimEvent addStopEvent(double time) {
        return new CarWashStop(time);
    }

    @Override
    public double getArrivalTime() {
        return exponentialRandomStream.next();
    }

    public void setElapsedSimulationTime(double elapsedSimulationTime) {
        this.elapsedSimulationTime =+ elapsedSimulationTime;
    }

    @Override
    public double getElapsedTime() {
        return this.elapsedSimulationTime;
    }

    @Override
    public double getLeaveTime() {
        return slowDist.next();
    }


    public SimEvent createArriveEvent() {
        return null;
    }
}

package carwash;

import simulator.SimEvent;
import simulator.SimState;

import java.util.LinkedList;

/**
 * Created by emilaasa on 03/03/16.
 */
public class CarWashLeave implements SimEvent {
    double time;

    public CarWashLeave(SimState state) {
        this.time = state.getElapsedTime() + state.getLeaveTime();
    }

    @Override
    public void changeState() {

    }

    @Override
    public LinkedList<SimEvent> execute(LinkedList<SimEvent> linkedList, SimState state) {

        return linkedList;
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public String toString(){
        return "LEFT";
    }
}

package carwash;

import simulator.SimEvent;
import simulator.SimState;

import java.util.LinkedList;

/**
 * Created by emilaasa on 02/03/16.
 */
public class CarWashStop implements SimEvent {
    double time;
    public CarWashStop(double time) {
        this.time = time;
    }

    @Override
    public void changeState() {

    }

    @Override
    public LinkedList<SimEvent> execute(LinkedList<SimEvent> linkedList, SimState state) {
        System.out.println("executed StopEvent");
        return linkedList;
    }

    @Override
    public double getTime() {
        return time;
    }

    @Override
    public String toString(){
        return "STOP";
    }
}

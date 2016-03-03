package carwash;

import simulator.SimEvent;
import simulator.SimState;

import java.util.LinkedList;

/**
 * Created by emilaasa on 02/03/16.
 */
public class CarWashArrive implements SimEvent {
    double time = 0;
    SimState state;


    public CarWashArrive(SimState state){
        this.state = state;
        double elapsed = this.state.getElapsedTime() + this.state.getArrivalTime();

        this.time = elapsed;
        this.state.addToElapsedSimulationTime(elapsed);
    }


    @Override
    public void changeState() {

    }

    @Override
    public LinkedList<SimEvent> execute(LinkedList<SimEvent> linkedList, SimState state) {
        linkedList.add(new CarWashArrive(this.state));
        linkedList.add(new CarWashLeave(this.state));
        linkedList.sort((e1, e2) -> Double.compare(e1.getTime(), e2.getTime()));
        return linkedList;
    }

    @Override
    public double getTime() {

        return time;
    }

    @Override
    public String toString(){
        return "ARRIVED";
    }
}

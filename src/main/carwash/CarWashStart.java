package carwash;

import simulator.SimEvent;
import simulator.SimState;

import java.util.LinkedList;

/**
 * Created by emilaasa on 02/03/16.
 */
public class CarWashStart implements SimEvent {
    double time = 0;
    SimState state;

    public CarWashStart(SimState state){
        this.state = state;
    }
    @Override
    public void changeState() {

    }


    @Override
    public LinkedList<SimEvent> execute(LinkedList<SimEvent> linkedList, SimState state) {
        this.state = state;
        System.out.println("Exectued CarWashStart");
        System.out.println("appending carwasharrive to new list");
        linkedList.add(new CarWashArrive(this.state));
        linkedList.sort((e1, e2) -> Double.compare(e1.getTime(), e2.getTime()));
        return linkedList;
    }

    @Override
    public double getTime() {
        return 0;
    }
}

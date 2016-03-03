package simulator;

/**
 * Created by emilaasa on 02/03/16.
 */
public interface SimEventFactory {

    void addStartAndStop();

    void setEventQueue(SimEventQueue eventQueue);

    void endSimulation();

    void newArriveEvent(SimState state, SimEventFactory factory);
}

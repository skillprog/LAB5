package simulator;

import java.util.LinkedList;

public interface SimEvent{
    void changeState();
    LinkedList<SimEvent> execute(LinkedList<SimEvent> linkedList, SimState state);
    double getTime();
}

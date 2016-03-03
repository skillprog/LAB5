package simulator;

import java.util.LinkedList;
import java.util.stream.Collector;

/**
 * Created by emilaasa on 02/03/16.
 */
public class SimEventQueue {
    LinkedList<SimEvent> linkedList;

    public SimEventQueue(){
        this.linkedList = new LinkedList<>();
    }



    public boolean hasNext() {
        return this.linkedList.size() > 0;
    }

    public SimEvent execute() {
        return linkedList.get(0);
    }

    public void terminate() {
        linkedList.clear();
    }
}

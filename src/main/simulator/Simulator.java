package simulator;


import carwash.CarWashStart;
import carwash.CarWashStop;

import java.util.LinkedList;


public class Simulator {
    SimState state;
    SimView view;


    public Simulator(SimState state, SimView view) {
        this.state = state;
        this.view = view;
    }

    public void start() {

        LinkedList<SimEvent> linkedList = new LinkedList<>();

        SimEvent startEvent = new CarWashStart(this.state);
        SimEvent stopEvent = new CarWashStop(15);
        linkedList.add(startEvent);
        linkedList.add(stopEvent);

        linkedList.stream()
                .forEach(e -> System.out.println(e.toString()));

        int debugCounter = 0;
        while (true){
            SimEvent currentEvent = linkedList.get(0);
            if("STOP".equals(currentEvent.toString())){
                break;
            }
            System.out.println("" + currentEvent.toString() +", time: " + currentEvent.getTime());
            linkedList = linkedList.pop().execute(linkedList, this.state);
        }
    }


    //TODO make ordered insertion thingy
    public static LinkedList<SimEvent> addInTimeOrder(LinkedList<SimEvent> linkedList, SimEvent event){

        return linkedList;
    }
}

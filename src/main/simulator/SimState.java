package simulator;

public interface SimState{
    SimEvent addStartEvent();
    SimEvent addStopEvent(double time);
    double getArrivalTime();
    void setElapsedSimulationTime(double time);
    double getElapsedTime();
    double getLeaveTime();
}


package simulator;

public interface SimState{
    double getArrivalTime();
    void addToElapsedSimulationTime(double time);
    double getElapsedTime();
    double getLeaveTime();
}

